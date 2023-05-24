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
    static int curVal, maxVal, temp;
    
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
        curVal = 0;
        for (int i = 0; i < K; i++) {
            curVal += arr[i];
        }
        maxVal = curVal;
        
        temp = K;
        while (true) {
            if (temp >= N) {
                break;
            }
            curVal += arr[temp] - arr[temp - K];
            maxVal = Math.max(maxVal, curVal);
            temp++;
        }
        
        // write
        bw.write(maxVal + "");
        bw.flush();
        bw.close();
    }
}