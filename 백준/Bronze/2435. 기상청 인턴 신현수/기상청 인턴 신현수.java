import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N, K;
    static int[] arr;
    static int answer;
    static int curSum;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        answer = -10000;
        curSum = 0;
        if (N == K) {
            for (int i = 0; i < N; i++) {
                curSum += arr[i];
            }
            answer = curSum;
        } else {
            for (int i = 0; i < N - K + 1; i++) {
                curSum = 0;
                for (int j = i; j < i + K; j++) {
                    curSum += arr[j];
                }
                answer = Math.max(answer, curSum);
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}