import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int x, n;

    public static void main(String[] args) throws IOException {
        // read
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        // process
        if (n != 1 && n % 2 == 1) bw.write("ERROR\n");
        else if ((x < 0 && n == 1) || (x > 0 && n == 0)) bw.write("INFINITE\n");
        else if (x > 0 && n != 0 && n % 2 == 0) {
            int temp = n / 2;
            bw.write((x + temp - 1) / temp - 1 + "\n");
        }
        else bw.write(0 + "\n");

        // write
        bw.flush();
        bw.close();
    }
}