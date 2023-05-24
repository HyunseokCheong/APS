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
    static int             k;
    static int             w;
    static int             m;
    static int             stroke;
    
    static void input() throws IOException {
        stk();
        k = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        stroke = 0;
        while (k < w) {
            stroke++;
            k += m;
        }
        bw.write(stroke + endl);
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