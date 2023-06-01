import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             N;
    static int             M;
    static int[]           arr;
    static int             answer;
    
    static void input() throws IOException {
        N   = Integer.parseInt(br.readLine());
        M   = Integer.parseInt(br.readLine());
        arr = new int[N];
        stk();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static int twoPointer() {
        int result = 0;
        
        Arrays.sort(arr);
        int L = 0;
        int R = N - 1;
        while (L != R) {
            int sum = arr[L] + arr[R];
            if (sum == M) {
                result++;
                L++;
            } else if (sum < M) {
                L++;
            } else {
                R--;
            }
        }
        
        return result;
    }
    
    static void process() throws IOException {
        answer = twoPointer();
        bw.write(answer + endl);
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