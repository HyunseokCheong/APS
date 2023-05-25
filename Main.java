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
    static int             X;
    static int             K;
    static int             answer;
    
    static void input() throws IOException {
        stk();
        X = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        if (K * 7 <= X) {
            answer = K * 7000;
        } else if (K * 3.5 <= X) {
            answer = K * 3500;
        } else if (K * 1.75 <= X) {
            answer = K * 1750;
        } else {
            answer = 0;
        }
        
        bw.write(answer + endl);
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
