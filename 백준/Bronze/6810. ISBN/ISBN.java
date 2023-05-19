import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String endl = "\n";
    static String blank = " ";
    static int origin = 91;

    static void input() throws IOException {
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                origin += Integer.parseInt(br.readLine());
            } else {
                origin += Integer.parseInt(br.readLine()) * 3;
            }
        }
    }

    static void process() throws IOException {
        bw.write("The 1-3-sum is " + origin + endl);
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