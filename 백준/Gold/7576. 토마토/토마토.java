import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // read
    static int n, m;
    static int[][] matrix;

    // process
    static Queue<int[]> q = new LinkedList<>();
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};

    public static int bfs() {
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (matrix[nr][nc] == 0) {
                    matrix[nr][nc] = matrix[r][c] + 1;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        int maxValue = Integer.MIN_VALUE;
        if (zeroCheck()) {
            return -1;
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maxValue = Math.max(maxValue, matrix[i][j]);
                }
            }
            return maxValue - 1;
        }
    }

    public static boolean zeroCheck() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) return true;
            }
        }
        return false;
    }

    // write

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        matrix = new int[n][m];

        // process
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] == 1) q.add(new int[]{i, j});
            }
        }
        // write
        bw.write(bfs() + "");
        bw.flush();
        bw.close();
    }
}