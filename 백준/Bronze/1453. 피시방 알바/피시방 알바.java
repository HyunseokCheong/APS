import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        boolean[] seat = new boolean[101];
        int count = 0;
        st = new StringTokenizer(br.readLine());
        br.close();
        for (int i = 0; i < n; i++) {
            int customer = Integer.parseInt(st.nextToken());
            if (seat[customer]) {
                count++;
                continue;
            }
            seat[customer] = true;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}