import java.io.*;
import java.util.*;

public class Main {

    // declare
    static int n;
    static int[] dp;
    static int answerRec;
    static int answerDP;
    static int countA, countB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        answerRec = fibonacciRec(n);

        dp = new int[n + 1];
        answerDP = fibonacciDP(n);

        // print
        bw.write(countA + " " + countB + "\n");
        bw.flush();
        bw.close();
    }

    static int fibonacciRec(int n) {
        if (n == 1 || n == 2) {
            countA++;
            return 1;
        } else {
            return fibonacciRec(n - 1) + fibonacciRec(n - 2);
        }
    }

    static int fibonacciDP(int n) {
        dp[1] = dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            countB++;
        }
        return dp[n];
    }
}