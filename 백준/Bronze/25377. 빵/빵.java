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
    static int N;
    static int A, B;
    static int minTime;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        minTime = Integer.MAX_VALUE;
        while (N-- >0) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            if (A <= B) {
                minTime = Math.min(minTime, B);
            }
        }
        if (minTime == Integer.MAX_VALUE) {
            minTime = -1;
        }
        
        // write
        bw.write(minTime + "");
        bw.flush();
        bw.close();
    }
}