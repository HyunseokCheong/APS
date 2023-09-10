import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, k;
    static int min, max;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        // 1000 - (5 * 127) - 1 = 1000 - 635 - 1 = 364
        max = n - (m * (k - 1)) - 1;
        // 1000 - (5 * 128) = 1000 - 640 = 360
        min = n - (m * k);

        max = Math.max(max, 0);
        min = Math.max(min, 0);

        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
    }
}