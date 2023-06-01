import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // read
    static int n;

    // process

    // write
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());

        // process
        for (int i = 0; i < n; i++) answer += Integer.parseInt(br.readLine());

        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}