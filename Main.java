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
    static int             X, Y, minTime;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        X  = Integer.parseInt(st.nextToken());
        Y  = Integer.parseInt(st.nextToken());
        
        // solve
        if (X > Y) {
            minTime = X + Y;
        } else {
            minTime = Y - X;
        }
        
        // write
        bw.write(minTime + "");
        bw.flush();
        bw.close();
    }
}