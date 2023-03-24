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
    static int             wc, hc, ws, hs;
    
    static void input() throws IOException {
        stk();
        wc = Integer.parseInt(st.nextToken());
        hc = Integer.parseInt(st.nextToken());
        ws = Integer.parseInt(st.nextToken());
        hs = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        bw.write(wc >= ws + 2 && hc >= hs + 2 ? "1" : "0" + endl);
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