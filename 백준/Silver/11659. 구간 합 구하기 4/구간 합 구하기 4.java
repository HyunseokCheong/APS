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
    static int N, M;
    static int[] arr, prefixSum;
    static int left, right;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        prefixSum = new int[N];
        prefixSum[0] = arr[0];
        if (N != 1) {
            for (int i = 1; i < N; i++) {
                prefixSum[i] = prefixSum[i - 1] + arr[i];
            }
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            left = Integer.parseInt(st.nextToken());
            right = Integer.parseInt(st.nextToken());
            if (left == 1) {
                bw.write(prefixSum[right - 1] + "\n");
            } else {
                bw.write(prefixSum[right - 1] - prefixSum[left - 2] + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}