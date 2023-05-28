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
    static int             left;
    static int             right;
    static int             sum;
    
    public static void main(String[] args) throws IOException {
        // read
        st    = new StringTokenizer(br.readLine());
        left  = Integer.parseInt(st.nextToken());
        right = Integer.parseInt(st.nextToken());
        
        // solve
        sum = left + right;
        if (sum == 0) {
            bw.write("Not a moose" + "");
        } else if (left == right) {
            bw.write("Even " + sum + "");
        } else {
            bw.write("Odd " + Math.max(left, right) * 2 + "");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}