import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, n;
    static int[] dp;

    static void read() throws IOException {
        n = Integer.parseInt(br.readLine());
    }

    static void solve() {
        dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= 10; i++) dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
    }

    static void write() throws IOException {
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            read();
            solve();
            bw.write(dp[n] + "\n");
        }
        write();
    }
}