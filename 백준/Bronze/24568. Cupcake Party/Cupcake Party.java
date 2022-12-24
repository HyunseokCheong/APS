import java.io.*;
import java.math.BigInteger;

public class Main {
    // declare
    static int box, smallBox, student, answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read
        box = Integer.parseInt(br.readLine()) * 8;
        smallBox = Integer.parseInt(br.readLine()) * 3;

        // solve
        student = 28;
        answer = box + smallBox - student;
        if (answer < 0) answer = 0;

        // print
        System.out.println(answer);
    }
}