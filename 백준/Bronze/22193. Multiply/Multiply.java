import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    // declare
    static String input;
    static BigInteger a, b;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        input = br.readLine();
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        // solve
        System.out.println(a.multiply(b));
    }
}