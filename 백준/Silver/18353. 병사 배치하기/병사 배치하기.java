import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 가장 긴 증가 수열을 찾고, 해당 수열에 포함되지 않는 숫자를 구한다.
 * 배열의 길이 - 가장 긴 즐가 수열
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, result;
    static int[] soldiers, dp;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        soldiers = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            soldiers[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        result = 0;
        dp = new int[n + 1];
        Arrays.fill(dp, 1);
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i; j++) {
                if (soldiers[j] > soldiers[i]) {
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