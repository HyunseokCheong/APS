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
    static int             A;
    static int             B;
    static double          answer;
    
    static void input() throws IOException {
        stk();
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        answer = 1 / (1 + Math.pow(10, (B - A) / 400.0));
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