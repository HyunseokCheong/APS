import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static char[][] matrix;

    // process
    static int nr, nc;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1}, currentPosition;
    static boolean[][] visited;
    static Queue<int[]> queue = new LinkedList<>();

    public static void bfs(int r, int c) {
        queue.add(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            currentPosition = queue.poll();
            for (int i = 0; i < 4; i++) {
                nr = currentPosition[0] + dr[i];
                nc = currentPosition[1] + dc[i];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
                if (visited[nr][nc] || matrix[nr][nc] != matrix[r][c]) continue;
                queue.add(new int[]{nr, nc});
                visited[nr][nc] = true;
            }
        }
    }

    // write
    static int rgb, noRgb;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        matrix = new char[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = br.readLine().toCharArray();
        }

        // process
        // rgb
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    rgb++;
                    bfs(i, j);
                }
            }
        }
        // convert to noRgb
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 'R') {
                    matrix[i][j] = 'G';
                }
            }
        }
        // noRgb
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    noRgb++;
                    bfs(i, j);
                }
            }
        }

        // write
        bw.write(rgb + " " + noRgb);
        bw.flush();
        bw.close();
    }
}