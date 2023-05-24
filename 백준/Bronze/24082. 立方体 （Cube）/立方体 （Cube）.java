import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int x, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        x = Integer.parseInt(br.readLine());

        // solve
        answer = x * x * x;

        // print
        System.out.println(answer);
    }
}