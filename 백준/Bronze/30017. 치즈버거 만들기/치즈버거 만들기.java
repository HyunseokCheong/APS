import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b;
    static int result;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        result = solve(a, b);
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }

    static int solve(int a, int b) {
        if (a == b) {
            return a + b - 1;
        }
        if (a > b) {
            return b + 1 + b;
        }
        return a + a - 1;
    }
}