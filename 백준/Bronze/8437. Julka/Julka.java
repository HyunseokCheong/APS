import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger total = new BigInteger(br.readLine());
        BigInteger diff = new BigInteger(br.readLine());
        BigInteger two = new BigInteger("2");

        bw.write(String.valueOf((total.subtract(diff)).divide(two).add(diff)) + "\n");
        bw.write(String.valueOf((total.subtract(diff)).divide(two) + "\n"));

        bw.flush();
        bw.close();
    }
}