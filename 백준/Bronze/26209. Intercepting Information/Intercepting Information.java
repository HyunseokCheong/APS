import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 8; i++) {
            input = Integer.parseInt(st.nextToken());
            if (input == 9) {
                System.out.println("F");
                return;
            }
        }
        System.out.println("S");
    }
}