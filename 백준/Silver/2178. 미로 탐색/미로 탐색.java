import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // read
    static int n, m;
    static int[][] matrix;
    // process
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1}, curPosition;
    static int[][] dist; // 좌표별 최단거리 저장
    // write
    static int answerCount; // dist[n-1][m-1] 과 같은 값

    public static void main(String[] args) throws IOException {
        // read
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        matrix = new int[n][m];
        dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = input.charAt(j) - '0';
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        // process
        bfs(0, 0, 1);

        // write
        bw.write(dist[n-1][m-1] + "\n");
        bw.flush();
        bw.close();
    }

    public static boolean isOk(int r, int c, int curDist) {
        return r >= 0 && r < n && c >= 0 && c < m && matrix[r][c] == 1 && dist[r][c] > curDist;
    }

    public static void bfs(int r, int c, int curDist) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c, curDist});
        dist[r][c] = curDist;

        while (!queue.isEmpty()) {
            curPosition = queue.poll();
            r = curPosition[0];
            c = curPosition[1];
            curDist = curPosition[2];

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (isOk(nr, nc, curDist + 1)) {
                    queue.add(new int[]{nr, nc, curDist + 1});
                    dist[nr][nc] = curDist + 1;
                }
            }
        }
    }
}