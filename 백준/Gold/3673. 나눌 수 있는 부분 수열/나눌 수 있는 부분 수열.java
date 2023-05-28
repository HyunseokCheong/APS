import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int             C, D, N;
    static long[] arr   = new long[50001];
    static long[] count = new long[1000001];
    static long[] sum   = new long[50001];
    static long   answer;
    
    
    public static void main(String[] args) throws IOException {
        // read
        C = Integer.parseInt(br.readLine());
        
        // solve
        while (C-- > 0) {
            answer = 0;
            Arrays.fill(arr, 0);
            Arrays.fill(count, 0);
            Arrays.fill(sum, 0);
            
            st = new StringTokenizer(br.readLine());
            D  = Integer.parseInt(st.nextToken());
            N  = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i < N + 1; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                sum[i] = (sum[i - 1] + arr[i]) % D;
                count[(int) sum[i]]++;
            }
            
            answer += count[0];
            for (int i = 0; i < D; i++) {
                answer += count[i] * (count[i] - 1) / 2;
            }
            
            System.out.println(answer);
        }
    }
}