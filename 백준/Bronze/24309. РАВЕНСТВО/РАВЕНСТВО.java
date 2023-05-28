import java.io.*;
import java.math.BigInteger;

public class Main {
    // declare
    static BigInteger a, b, c, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read
        a = new BigInteger(br.readLine());
        b = new BigInteger(br.readLine());
        c = new BigInteger(br.readLine());

        // solve
        answer = (b.subtract(c)).divide(a);

        // print
        System.out.println(answer);
    }
}