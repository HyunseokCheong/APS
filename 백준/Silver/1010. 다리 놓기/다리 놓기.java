import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[][] dp = new int[30][30];
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        
        int n, m;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            bw.write(recur(m, n) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static int recur(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        
        return dp[n][r] = recur(n - 1, r - 1) + recur(n - 1, r);
    }
}