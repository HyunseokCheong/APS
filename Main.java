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
    static int             preSun;
    static int             nextSun;
    static int             preMoon;
    static int             nextMoon;
    static int[]           timeLine;
    static int             answer;
    
    static void input() throws IOException {
        stk();
        preSun  = Integer.parseInt(st.nextToken());
        nextSun = Integer.parseInt(st.nextToken());
        stk();
        preMoon  = Integer.parseInt(st.nextToken());
        nextMoon = Integer.parseInt(st.nextToken());
    }
    
    static void fillTimeLine(int pre, int next) {
        int cur = next - pre;
        for (int i = cur; i <= 5000; i += next) {
            timeLine[i]++;
            if (timeLine[i] == 2) {
                answer = i;
                break;
            }
        }
    }
    
    static void process() throws IOException {
        timeLine = new int[5001];
        fillTimeLine(preSun, nextSun);
        fillTimeLine(preMoon, nextMoon);
        
        bw.write(answer + blank);
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
