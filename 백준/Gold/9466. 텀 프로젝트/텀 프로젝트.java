import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, n;
    static int[] arr;

    // process
    static boolean Ok;
    static int nowIdx;
    static int[] state; // 0 : not visited, -1 : done, else : index

    static void solve(int idx) {
        nowIdx = idx;
        Ok = false;

        while (true) {
            state[nowIdx] = idx;
            nowIdx = arr[nowIdx];

            if (state[nowIdx] == idx) {
                while (state[nowIdx] != -1) {
                    state[nowIdx] = -1;
                    nowIdx = arr[nowIdx];
                }
                Ok = true;
                return;
            } else if (state[nowIdx] != 0) {
                return;
            }
        }
    }

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n + 1];
            state = new int[n + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            // process
            answer = 0;
            for (int i = 1; i <= n; i++) {
                if (state[i] == 0) solve(i);
            }
            for (int i = 1; i <= n; i++) {
                if (state[i] != -1) answer++;
            }

            // write
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}