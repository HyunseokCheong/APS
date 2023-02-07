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
    static int             N, H;
    static int[] bottom, top;
    static int minVal, count, obstacle;
    
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N  = Integer.parseInt(st.nextToken());
        H  = Integer.parseInt(st.nextToken());
        
        bottom = new int[H + 2];
        top    = new int[H + 2];
        for (int i = 0; i < N / 2; i++) {
            bottom[Integer.parseInt(br.readLine())]++;
            top[H - Integer.parseInt(br.readLine()) + 1]++;
        }
        
        // solve
        for (int i = 1; i <= H; i++) {
            bottom[i] += bottom[i - 1];
        }
        for (int i = H; i >= 1; i--) {
            top[i] += top[i + 1];
        }
        
        minVal = N;
        count  = 0;
        for (int i = 1; i <= H; i++) {
            obstacle = bottom[H] - bottom[i - 1] + top[1] - top[i + 1];
            
            if (obstacle < minVal) {
                minVal = obstacle;
                count  = 1;
            } else if (obstacle == minVal) {
                count++;
            }
        }
        
        // write
        bw.write(minVal + " " + count + " ");
        bw.flush();
        bw.close();
    }
}