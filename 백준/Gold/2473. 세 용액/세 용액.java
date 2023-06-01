import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br       = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw       = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl     = "\n";
    static String          blank    = " ";
    static int             N;
    static long[]          arr;
    static long[]          three    = new long[3];
    static long            maxValue = Long.MAX_VALUE;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        stk();
        arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
    }
    
    static void solve(int F) {
        int L = F + 1;
        int R = N - 1;
        
        while (L < R) {
            
            long sum    = arr[L] + arr[R] + arr[F];
            long absSum = Math.abs(sum);
            
            if (absSum < maxValue) {
                three[0] = arr[F];
                three[1] = arr[L];
                three[2] = arr[R];
                maxValue = absSum;
            }
            
            if (sum > 0) {
                R--;
            } else {
                L++;
            }
        }
    }
    
    static void process() throws IOException {
        Arrays.sort(arr);
        for (int i = 0; i < N - 2; i++) {
            solve(i);
        }
        
        for (int i = 0; i < 3; i++) {
            bw.write(three[i] + blank);
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}