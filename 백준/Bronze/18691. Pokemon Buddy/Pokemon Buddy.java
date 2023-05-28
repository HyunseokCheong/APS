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
    static int             group; // 1 3 5
    static int             haveCandy;
    static int             needCandy;
    static int             needKiloMeter;
    
    static void input() throws IOException {
        stk();
        group     = Integer.parseInt(st.nextToken());
        haveCandy = Integer.parseInt(st.nextToken());
        needCandy = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        needCandy = needCandy - haveCandy;
        if (group == 1) {
            needKiloMeter = needCandy;
        } else if (group == 2) {
            needKiloMeter = needCandy * 3;
        } else {
            needKiloMeter = needCandy * 5;
        }
        
        if (needKiloMeter <= 0) {
            bw.write(0 + endl);
        } else {
            bw.write(needKiloMeter + endl);
        }
    }
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            input();
            process();
        }
        
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}