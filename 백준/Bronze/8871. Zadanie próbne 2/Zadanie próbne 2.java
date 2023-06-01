import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // (n + 1) * 2, (n + 1) * 3
        int n = Integer.parseInt(br.readLine()) + 1;

        bw.write(n * 2 + " " + n * 3 + "\n");
        bw.flush();
        bw.close();
    }
}