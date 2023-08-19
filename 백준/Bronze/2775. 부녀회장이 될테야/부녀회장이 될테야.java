import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        int n;
        int k;
        int[][] dp = new int[15][15];
        
        for (int i = 0; i < 15; i++) {
            dp[0][i] = i;
        }
        
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        while (testCase-- > 0) {
            k = Integer.parseInt(br.readLine());
            n = Integer.parseInt(br.readLine());
            bw.write(dp[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}