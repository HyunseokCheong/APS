import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int n1, n2, n12, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        n12 = Integer.parseInt(st.nextToken());

        // solve
        answer = (n1 + 1) * (n2 + 1) / (n12 + 1) - 1;

        // print
        System.out.println(answer);
    }
}