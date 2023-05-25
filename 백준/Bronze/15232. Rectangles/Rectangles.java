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
    static int             R;
    static int             C;
    
    static void input() throws IOException {
        R = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                bw.write("*");
            }
            bw.write(endl);
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