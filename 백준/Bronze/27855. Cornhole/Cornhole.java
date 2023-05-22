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
    static int             pointOfA;
    static int             pointOfB;
    static int             inPoint;
    static int             onPoint;

    static void input() throws IOException {
        stk();
        inPoint  = Integer.parseInt(st.nextToken());
        onPoint  = Integer.parseInt(st.nextToken());
        pointOfA = inPoint * 3 + onPoint;
        stk();
        inPoint  = Integer.parseInt(st.nextToken());
        onPoint  = Integer.parseInt(st.nextToken());
        pointOfB = inPoint * 3 + onPoint;
    }

    static void process() throws IOException {
        if (pointOfA > pointOfB) {
            bw.write("1 " + (pointOfA - pointOfB) + endl);
        } else if (pointOfA < pointOfB) {
            bw.write("2 " + (pointOfB - pointOfA) + endl);
        } else {
            bw.write("NO SCORE" + endl);
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