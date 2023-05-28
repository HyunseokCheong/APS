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
    static int[]           arr;
    static int             max   = Integer.MIN_VALUE;
    static int             min   = Integer.MAX_VALUE;
    static int             sum   = 0;
    static int             answer;
    
    static void input() throws IOException {
        arr = new int[3];
        stk();
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max    = Math.max(max, arr[i]);
            min    = Math.min(min, arr[i]);
            sum += arr[i];
        }
    }
    
    static void process() throws IOException {
        answer = sum - max - min;
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