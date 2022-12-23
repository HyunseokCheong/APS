import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int testCase, n; // 0 <= n <= 40
    static Integer[][] dp;

    static Integer[] fibo(int num) {
        if (dp[num][0] == null || dp[num][1] == null) {
            dp[num][0] = fibo(num - 1)[0] + fibo(num - 2)[0];
            dp[num][1] = fibo(num - 1)[1] + fibo(num - 2)[1];
        }
        return dp[num];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        testCase = Integer.parseInt(br.readLine());

        // solve
        dp = new Integer[41][2];
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        fibo(40);

        while (testCase-- > 0) {
            n = Integer.parseInt(br.readLine());
            // print
            System.out.println(dp[n][0] + " " + dp[n][1]);
        }
    }
}