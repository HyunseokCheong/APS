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
    // declare
    static int a, b; // -1000 <= a, b <= 1000
    // (x + c) * (x + d) = x^2 + (c + d) * x + c * d
    // c * d = b 따라서 답은 -1000 ~ 1000의 범위안에 있다.

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        // solve
        for (int x = -1000; x < 1001; x++) {
            if (x * x + 2 * a * x + b == 0) {
                bw.write(x + " ");
            }
        }

        // write
        bw.flush();
        bw.close();
    }
}