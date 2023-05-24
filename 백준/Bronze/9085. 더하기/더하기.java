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
    static int             testCase;
    static int             numberOfQuery;
    static int             answer;
    
    static void input() throws IOException {
        testCase = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        while (testCase-- > 0) {
            numberOfQuery = Integer.parseInt(br.readLine());
            answer        = 0;
            st            = new StringTokenizer(br.readLine());
            for (int i = 0; i < numberOfQuery; i++) {
                answer += Integer.parseInt(st.nextToken());
            }
            bw.write(answer + endl);
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}