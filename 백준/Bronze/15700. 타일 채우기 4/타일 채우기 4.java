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
    static long n;
    static long m;

    static void input() throws IOException {
        stk();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }

    static void process() throws IOException {
        bw.write((n * m) / 2 + endl);
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