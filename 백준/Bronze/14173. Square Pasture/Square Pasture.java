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
    static int[]           xList;
    static int[]           yList;
    static int             minX;
    static int             minY;
    static int             maxX;
    static int             maxY;
    static int             maxDiff;
    
    static void input() throws IOException {
        xList = new int[4];
        yList = new int[4];
        stk();
        xList[0] = Integer.parseInt(st.nextToken());
        yList[0] = Integer.parseInt(st.nextToken());
        xList[1] = Integer.parseInt(st.nextToken());
        yList[1] = Integer.parseInt(st.nextToken());
        stk();
        xList[2] = Integer.parseInt(st.nextToken());
        yList[2] = Integer.parseInt(st.nextToken());
        xList[3] = Integer.parseInt(st.nextToken());
        yList[3] = Integer.parseInt(st.nextToken());
    }
    
    static void getMinMax() {
        minX = Integer.MAX_VALUE;
        minY = Integer.MAX_VALUE;
        maxX = Integer.MIN_VALUE;
        maxY = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            minX = Math.min(minX, xList[i]);
            minY = Math.min(minY, yList[i]);
            maxX = Math.max(maxX, xList[i]);
            maxY = Math.max(maxY, yList[i]);
        }
        maxDiff = Math.max(maxX - minX, maxY - minY);
    }
    
    static void process() throws IOException {
        getMinMax();
        bw.write(maxDiff * maxDiff + endl);
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