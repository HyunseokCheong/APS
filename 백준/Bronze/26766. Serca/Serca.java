import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        while (n-- > 0) {
            System.out.println(" @@@   @@@ \n" +
                    "@   @ @   @\n" +
                    "@    @    @\n" +
                    "@         @\n" +
                    " @       @ \n" +
                    "  @     @  \n" +
                    "   @   @   \n" +
                    "    @ @    \n" +
                    "     @     ");
        }

        // print
        bw.flush();
        bw.close();
    }
}