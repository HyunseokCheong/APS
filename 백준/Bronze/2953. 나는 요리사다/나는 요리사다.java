import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br       = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw       = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl     = "\n";
    static String          blank    = " ";
    static int             curScore;
    static int             curIndex;
    static int             maxScore = Integer.MIN_VALUE;
    static int             maxIndex;
    
    static void input() throws IOException {
        curScore = 0;
        stk();
        for (int i = 0; i < 4; i++) {
            curScore += Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() {
        if (maxScore < curScore) {
            maxScore = curScore;
            maxIndex = curIndex;
        }
        curIndex++;
    }
    
    static void output() throws IOException {
        bw.write(maxIndex + blank + maxScore);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        curIndex = 1;
        for (int i = 0; i < 5; i++) {
            input();
            process();
        }
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}