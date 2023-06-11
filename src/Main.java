import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int[] arr;
    static int count, answer;

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // solve
        for (int i = 1; i < 1000001; i++) {
            count = 0;
            for (int j = 0; j < 5; j++) {
                if (i % arr[j] == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer = i;
                break;
            }
        }

        // write
        bw.write(answer + " ");
        bw.flush();
        bw.close();
    }
}
