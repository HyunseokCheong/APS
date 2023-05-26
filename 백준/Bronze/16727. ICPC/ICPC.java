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
    static int             s1;
    static int             p1;
    static int             s2;
    static int             p2;
    static String          answer;
    
    static void input() throws IOException {
        stk();
        p1 = Integer.parseInt(st.nextToken());
        s1 = Integer.parseInt(st.nextToken());
        stk();
        s2 = Integer.parseInt(st.nextToken());
        p2 = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        if (p1 + p2 > s1 + s2) {
            answer = "Persepolis";
        } else if (p1 + p2 < s1 + s2) {
            answer = "Esteghlal";
        } else {
            if (s1 > p2) {
                answer = "Esteghlal";
            } else if (s1 < p2) {
                answer = "Persepolis";
            } else {
                answer = "Penalty";
            }
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