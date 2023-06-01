import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // l1, w1, l2, w2
        long l1, w1, l2, w2;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l1 = Long.parseLong(st.nextToken());
            w1 = Long.parseLong(st.nextToken());
            l2 = Long.parseLong(st.nextToken());
            w2 = Long.parseLong(st.nextToken());

            // Tie
            if (l1 * w1 == l2 * w2) bw.write("Tie" + "\n");
            else if (l1 * w1 > l2 * w2) bw.write("TelecomParisTech" + "\n");
            else bw.write("Eurecom" + "\n");
        }
        bw.flush();
        bw.close();
    }
}