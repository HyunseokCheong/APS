import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N;
    static int[]           arr;
    static int             maxVal;
    
    public static void main(String[] args) throws IOException {
        // read
        N   = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        st  = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        maxVal = Integer.MIN_VALUE;
        for (int i = 1; i <= N; i++) {
            arr[i] = Math.max(arr[i - 1] + arr[i], arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }
        
        // write
        bw.write(maxVal + "");
        bw.flush();
        bw.close();
    }
}