import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int y;
    static String ans;

    public static void main(String[] args) throws IOException {
        // read
        y = Integer.parseInt(br.readLine());

        // process
        ans = "A";

        // write
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }
}