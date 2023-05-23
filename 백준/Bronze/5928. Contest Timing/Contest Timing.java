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
    static int             D;
    static int             H;
    static int             M;
    static int             result;
    
    static void input() throws IOException {
        stk();
        D = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }
    
    static int getResult() {
        return D * 24 * 60 + H * 60 + M - (11 * 24 * 60 + 11 * 60 + 11);
    }
    
    static void process() throws IOException {
        result = getResult();
        if (result < 0) {
            bw.write("-1" + endl);
        } else {
            bw.write(result + endl);
        }
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