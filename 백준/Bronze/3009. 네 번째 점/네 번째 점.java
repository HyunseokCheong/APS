
import java.io.*;
import java.util.*;

public class Main {
    // declare
    static int a, b;
    static int[] checkA, checkB;
    static int answerA, answerB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        checkA = new int[1001];
        checkB = new int[1001];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            checkA[a]++;
            checkB[b]++;
        }

        for (int i = 1; i <= 1000; i++) {
            if (checkA[i] == 1) answerA = i;
            if (checkB[i] == 1) answerB = i;
        }
        System.out.println(answerA + " " + answerB);
    }
}