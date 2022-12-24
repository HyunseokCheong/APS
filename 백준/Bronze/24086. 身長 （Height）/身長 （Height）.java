import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int a, b, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());

        // solve
        answer = b - a;

        // print
        System.out.println(answer);
    }
}