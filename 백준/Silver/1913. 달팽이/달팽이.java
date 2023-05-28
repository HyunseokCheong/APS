import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, target, num, row, col, dir, answer_row, answer_col;
    static int[] dr = {1, 0, -1, 0}, dc = {0, 1, 0, -1};
    static int[][] answer;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        target = Integer.parseInt(br.readLine());

        // process
        num = n * n;
        dir = 0;
        row = 0;
        col = 0;
        answer = new int[n][n];
        solve(target);

        // write
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                bw.write(answer[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.write(answer_row + " " + answer_col);
        bw.flush();
        bw.close();
    }

    public static boolean ok(int row, int col) {
        return row >= 0 && row < n && col >= 0 && col < n && answer[row][col] == 0;
    }

    public static void solve(int target) throws IOException {
        while (num > 0) {
            if (ok(row, col)) {
                answer[row][col] = num;
                if (num == target) {
                    answer_row = row + 1;
                    answer_col = col + 1;
                }
                num--;
            } else {
                row -= dr[dir];
                col -= dc[dir];
                dir = (dir + 1) % 4;
            }
            row += dr[dir];
            col += dc[dir];
        }
    }
}