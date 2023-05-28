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
    static int             numberOfQuery;
    static int             cup1;
    static int             cup2;
    static int             ball;
    
    static void input() throws IOException {
        numberOfQuery = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        ball = 1;
        for (int i = 0; i < numberOfQuery; i++) {
            stk();
            cup1 = Integer.parseInt(st.nextToken());
            cup2 = Integer.parseInt(st.nextToken());
            
            if (ball == cup1) {
                ball = cup2;
            } else if (ball == cup2) {
                ball = cup1;
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(ball + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}