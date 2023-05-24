import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int a, b, c, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // solve
        // b / a * 3 = answer / c
        // answer = b / a * 3 * c
        answer = b / a * 3 * c;

        // print
        System.out.println(answer);
    }
}