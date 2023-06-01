import java.io.IOException;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static long k, a, b, c, d;
    static long answer;
    static boolean check;

    public static void main(String[] args) throws IOException {
        k = Long.parseLong(br.readLine());
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        d = Long.parseLong(st.nextToken());

        solve();
        if (!check) bw.write("No" + "");
        else bw.write("Yes" + " " + answer + "");
        bw.flush();
        bw.close();
    }

    static void solve() {
        long temp1 = a * k + b;
        long temp2 = c * k + d;
        if (temp1 == temp2) {
            check = true;
            answer = temp1;
        } else {
            check = false;
        }
    }
}