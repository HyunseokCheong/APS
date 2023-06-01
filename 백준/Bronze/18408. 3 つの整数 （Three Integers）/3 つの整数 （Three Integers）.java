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
    static int             answer;
    
    static void input() throws IOException {
        stk();
    }
    
    static void process() throws IOException {
        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                answer--;
                continue;
            }
            answer++;
        }
        
        if (answer < 0) {
            bw.write(1 + endl);
        } else {
            bw.write(2 + endl);
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