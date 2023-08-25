import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, s, n, q, p;
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            s = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                q = Integer.parseInt(st.nextToken());
                p = Integer.parseInt(st.nextToken());
                s += q * p;
            }
            
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}