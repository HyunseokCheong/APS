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
    static int             numberOfMulti;
    static int             answer;
    
    static void input() throws IOException {
        numberOfMulti = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        answer = 1;
        while (numberOfMulti-- > 0) {
            answer += Integer.parseInt(br.readLine()) - 1;
        }
        bw.write(answer + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}