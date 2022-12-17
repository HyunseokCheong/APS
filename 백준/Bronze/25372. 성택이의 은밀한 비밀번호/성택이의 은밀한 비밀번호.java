import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static String input;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());

        // process
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            // write
            if (input.length() < 6 || input.length() > 9) {
                bw.write("no" + "\n");
            } else {
                bw.write("yes" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}