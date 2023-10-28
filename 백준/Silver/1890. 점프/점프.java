import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long[][] dp;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        dp = new long[n][n];
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int jump = Integer.parseInt(st.nextToken());
                if (dp[i][j] >= 1 && jump != 0) {
                    if (j + jump < n) {
                        dp[i][j + jump] += dp[i][j];
                    }
                    if (i + jump < n) {
                        dp[i + jump][j] += dp[i][j];
                    }
                }
            }
        }
        bw.write(dp[n - 1][n - 1] + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}