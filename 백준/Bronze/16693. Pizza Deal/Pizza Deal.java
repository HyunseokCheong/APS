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
    static double          A1;
    static double          P1;
    static double          R1;
    static double          P2;
    static double          X;
    static double          Y;
    static String          answer;
    
    static void input() throws IOException {
        stk();
        A1 = Double.parseDouble(st.nextToken());
        P1 = Double.parseDouble(st.nextToken());
        stk();
        R1 = Double.parseDouble(st.nextToken());
        P2 = Double.parseDouble(st.nextToken());
    }
    
    static void process() throws IOException {
        X      = A1 / P1;
        Y      = Math.PI * R1 * R1 / P2;
        answer = X < Y ? "Whole pizza" : "Slice of pizza";
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