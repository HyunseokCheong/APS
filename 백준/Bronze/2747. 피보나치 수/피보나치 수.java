import java.io.*;
import java.util.*;

public class Main {

    // declare
    static int n;
    static long answer;
    static long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        dp = new long[n + 1];
        answer = fibonacci(n);

        // print
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static long fibonacci(int n) {
        dp[0] = 0;
        dp[1] = 1;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}