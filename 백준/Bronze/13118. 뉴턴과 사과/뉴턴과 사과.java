import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int[]           arr;
    static int             X;
    static int             answer;
    
    static void input() throws IOException {
        arr = new int[4];
        stk();
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        stk();
        X = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        answer = 0;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == X) {
                answer = i + 1;
                break;
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