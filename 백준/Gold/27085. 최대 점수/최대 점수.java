import java.io.*;
import java.util.*;

public class Main {

    // declare
    static int n, nowPosition;
    static int leftPosition, rightPosition; // idx
    static long nowScore, leftScore, rightScore; // score
    static long[] arr;

    static boolean isBreak;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        nowPosition = Integer.parseInt(st.nextToken());
        arr = new long[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // solve
        nowScore = 0;
        leftScore = 0;
        rightScore = 0;
        leftPosition = nowPosition;
        rightPosition = nowPosition;

        while (!isBreak) {
            isBreak = true;

            while (leftPosition > 1 && (leftScore + arr[leftPosition - 1] + nowScore) >= 0) {
                leftScore += arr[leftPosition - 1];
                leftPosition--;

                if (leftScore > 0) {
                    nowScore += leftScore;
                    leftScore = 0;
                    isBreak = false;
                    break;
                }
            }

            while (rightPosition < n && (rightScore + arr[rightPosition + 1] + nowScore) >= 0) {
                rightScore += arr[rightPosition + 1];
                rightPosition++;

                if (rightScore > 0) {
                    nowScore += rightScore;
                    rightScore = 0;
                    isBreak = false;
                    break;
                }
            }
        }

        bw.write(nowScore + "\n");

        // print
        bw.flush();
        bw.close();
    }
}