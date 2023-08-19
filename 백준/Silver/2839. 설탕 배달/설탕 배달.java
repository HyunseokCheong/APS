import java.io.*;
import java.util.Arrays;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 5001);
        
        if (n >= 3) {
            dp[3] = 1;
        }
        
        if (n >= 5) {
            dp[5] = 1;
        }
        
        for (int i = 6; i <= n; i++) {
            if (dp[i - 3] != 5001) {
                dp[i] = Math.min(dp[i], dp[i - 3] + 1);
            }
            if (dp[i - 5] != 5001) {
                dp[i] = Math.min(dp[i], dp[i - 5] + 1);
            }
        }
        
        int answer = dp[n] == 5001 ? -1 : dp[n];
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}