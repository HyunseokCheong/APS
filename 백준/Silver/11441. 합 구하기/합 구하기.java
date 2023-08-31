import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, s, e;
    static int[] pre;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        pre = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                pre[i] = Integer.parseInt(st.nextToken());
                continue;
            }
            pre[i] = pre[i - 1] + Integer.parseInt(st.nextToken());
        }
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            
            bw.write(pre[e] - pre[s - 1] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}