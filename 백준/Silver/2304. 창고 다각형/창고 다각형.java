import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N, L, H, area;
    static int[] arr, prefixSum, suffixSum;
    
    public static void main(String[] args) throws IOException {
        // read
        N         = Integer.parseInt(br.readLine());
        arr       = new int[1002];
        prefixSum = new int[1002];
        suffixSum = new int[1002];
        
        for (int i = 1; i <= N; i++) {
            st     = new StringTokenizer(br.readLine());
            L      = Integer.parseInt(st.nextToken());
            H      = Integer.parseInt(st.nextToken());
            arr[L] = H;
        }
        
        // solve
        for (int i = 1; i <= 1000; i++) {
            prefixSum[i] = Math.max(prefixSum[i - 1], arr[i]);
        }
        
        for (int i = 1000; i >= 1; i--) {
            suffixSum[i] = Math.max(suffixSum[i + 1], arr[i]);
            area += Math.min(prefixSum[i], suffixSum[i]);
        }
        
        // write
        bw.write(area + "");
        bw.flush();
        bw.close();
    }
}