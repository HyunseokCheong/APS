import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    // declare
    static int n;
    static BigInteger answer;
    static BigInteger[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        dp = new BigInteger[n + 2];
        answer = fibonacci(n);

        // print
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static BigInteger fibonacci(int n) {
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;
        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }
        }
        return dp[n];
    }
}