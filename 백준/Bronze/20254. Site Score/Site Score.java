import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int Ur, Tr, Uo, To, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        Ur = Integer.parseInt(st.nextToken());
        Tr = Integer.parseInt(st.nextToken());
        Uo = Integer.parseInt(st.nextToken());
        To = Integer.parseInt(st.nextToken());

        // solve
        answer = 56 * Ur + 24 * Tr + 14 * Uo + 6 * To;


        // print
        System.out.println(answer);
    }
}