import java.io.*;
import java.util.*;

public class Main {

    // declare
    static int n;
    static int maxValue;
    static int[] seq;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());
        seq = new int[n];
        dp = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // solve
        for (int i = 0; i < n; i++) {
            LIS(i);
        }

        maxValue = dp[0];
        for (int i = 1; i < n; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }

        // print
        bw.write(maxValue + "\n");
        bw.flush();
        bw.close();
    }

    static int LIS(int idx) {
        if (dp[idx] == 0) {
            dp[idx] = 1;
            for (int i = idx - 1; i >= 0; i--) {
                if (seq[i] > seq[idx]) {
                    dp[idx] = Math.max(dp[idx], LIS(i) + 1);
                }
            }
        }
        return dp[idx];
    }
}