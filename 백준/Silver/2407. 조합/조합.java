import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    // declare
    static BigInteger n, m, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        n = new BigInteger(st.nextToken());
        m = new BigInteger(st.nextToken());

        // solve
        // n! / (n - m)! * m!
        answer = factorial(n).divide(factorial(n.subtract(m)).multiply(factorial(m)));
        
        // print
        System.out.println(answer);
    }

    static BigInteger factorial(BigInteger x) {
        if (x.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        }
        return x.multiply(factorial(x.subtract(BigInteger.ONE)));
    }
}