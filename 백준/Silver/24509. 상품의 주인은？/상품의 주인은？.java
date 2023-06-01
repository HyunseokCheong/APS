import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int[][] arr;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][4];
        check = new boolean[n + 1];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 4; j++) {
                arr[idx][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 4; i++) {
            solve(i);
        }
    }

    public static void solve(int idx) throws IOException {
        int max = -1;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (!check[i] && arr[i][idx] > max) {
                ans = i;
                max = arr[i][idx];
            }
        }
        check[ans] = true;
        System.out.print(ans + " ");
    }
}