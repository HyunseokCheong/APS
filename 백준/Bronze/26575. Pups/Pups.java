import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int n;
    static double d,f, p;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        while (n--> 0) {
            st = new StringTokenizer(br.readLine());
            d = Double.parseDouble(st.nextToken());
            f = Double.parseDouble(st.nextToken());
            p = Double.parseDouble(st.nextToken());

            bw.write("$" + String.format("%.2f", d * f * p) + "\n");
        }

        // print
        bw.flush();
        bw.close();
    }
}