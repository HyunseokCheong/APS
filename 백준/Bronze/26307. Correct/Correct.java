import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int h, m, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken()) - 9;
        m = Integer.parseInt(st.nextToken());

        // solve
        answer = h * 60 + m;

        // print
        System.out.println(answer);
    }
}