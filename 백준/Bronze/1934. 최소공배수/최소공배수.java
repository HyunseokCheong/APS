import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, a, b, lcm, gcd;

    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }

    static void solve() {
        lcm = a * b / gcd(a, b);
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    static void write() throws IOException {
        bw.write(lcm + "\n");
    }

    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            read();
            solve();
            write();
        }
        bw.flush();
    }
}