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
    static String number;
    static boolean flag;


    static void input() throws IOException {
        number = br.readLine();
    }

    static void process() throws IOException {
        flag = true;
        for (int i = 0; i < 3; i++) {
            if (number.charAt(i) == '5') {
                continue;
            }
            flag = false;
            break;
        }
        bw.write(flag ? "YES" + endl : "NO" + endl);
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