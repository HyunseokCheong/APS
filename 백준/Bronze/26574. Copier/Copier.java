import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int n, input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        while (n-- >0) {
            input = Integer.parseInt(br.readLine());
            bw.write(input + " " + input + "\n");
        }

        // print
        bw.flush();
        bw.close();
    }
}