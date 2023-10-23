import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, result;
    static int[] soldier, dp;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        soldier = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            soldier[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        result = 0;
        dp = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (soldier[j] > soldier[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        bw.write(n - result + "\n");
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