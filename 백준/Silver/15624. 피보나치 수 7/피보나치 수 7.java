import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] fibo = new int[1000001];

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());

        // process
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1000000007;

        // write
        bw.write(fibo[n] + "\n");
        bw.flush();
        bw.close();
    }
}