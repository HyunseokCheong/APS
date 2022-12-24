import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int a, b;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // read
        input = br.readLine();

        // solve
        a = 0;
        b = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A') a++;
            else b++;
        }
        bw.write(a + " : " + b);

        // print
        bw.flush();
        bw.close();
    }
}