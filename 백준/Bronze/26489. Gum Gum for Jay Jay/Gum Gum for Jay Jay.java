import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String rockHead = "gum gum for jay jay", input;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        // read
        input = "";

        // process
        while ((input = br.readLine()) != null) {
            if (input.equals(rockHead)) answer += 1;
        }

        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}