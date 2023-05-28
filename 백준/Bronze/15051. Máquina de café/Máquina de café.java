import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             A1;
    static int             A2;
    static int             A3;
    static int             minTime;
    
    static void input() throws IOException {
        A1 = Integer.parseInt(br.readLine());
        A2 = Integer.parseInt(br.readLine());
        A3 = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        minTime = Integer.MAX_VALUE;
        minTime = Math.min(minTime, A2 * 2 + A3 * 4);
        minTime = Math.min(minTime, A1 * 2 + A3 * 2);
        minTime = Math.min(minTime, A1 * 4 + A2 * 2);
        bw.write(minTime + endl);
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