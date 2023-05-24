import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    // declare
    static BigInteger a, b, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read
        a = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());

        // solve
        answer = a.add(b);

        // print
        System.out.println(answer);
    }
}