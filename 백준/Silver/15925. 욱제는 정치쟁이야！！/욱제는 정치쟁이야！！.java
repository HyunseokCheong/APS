import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, isNextTime; // 1 <= n <= 31 홀수
    static int[][] map;

    // process
    static int count;

    // write
    static int answer; // 1 : 가능, 0 : 불가능

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        isNextTime = Integer.parseInt(st.nextToken());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // process
        solve();
        solve();

        answer = 1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != isNextTime) {
                    answer = 0;
                    break;
                }
            }
        }

        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    public static void solve() {
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (map[i][j] == isNextTime) {
                    count++;
                }
            }
            if (count > n / 2) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = isNextTime;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (map[j][i] == isNextTime) {
                    count++;
                }
            }
            if (count > n / 2) {
                for (int j = 0; j < n; j++) {
                    map[j][i] = isNextTime;
                }
            }
        }
    }
}