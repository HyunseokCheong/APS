import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static long a, b, c, temp, answer;

    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
    }

    static void solve() throws IOException {
        answer = recursion(a, b, c);
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static long recursion(long a, long b, long c) {
        if (b == 1) return a % c;
        temp = recursion(a, b / 2, c);
        if (b % 2 == 0) return (temp * temp) % c;
        else return (((temp * temp) % c) * a) % c;
    }

    public static void main(String[] args) throws IOException {
        /*
         * 모듈러 합동 공식
         * (a * b) % c = ((a % c) * (b % c)) % c
         * 
         * a ^ 8 = a ^ 4 * a ^ 4
         * a ^ 9 = a ^ 4 * a ^ 4 * a
         */
        read();
        solve();
    }
}