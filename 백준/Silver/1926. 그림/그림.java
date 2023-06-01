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
    static int direction = 0;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1}, curPoint;
    static boolean zeroCheck = true; // 0으로만 이루어진 배열인지 체크
    static boolean[][] visited; // 방문 체크

    // write
    static int answerCount = 0, answerArea = 0;

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        matrix = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
                if (matrix[i][j] == 1) zeroCheck = false;
            }
        }

        // process
        if (zeroCheck) { // 종료
            answerCount = 0;
            answerArea = 0;
        } else { // 작업 시작
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (isOk(i, j)) {
                        answerCount++;
                        bfs(i, j);
                    }
                }
            }
        }
        // write
        bw.write(answerCount + "\n");
        bw.write(answerArea + "\n");
        bw.flush();
        bw.close();
    }


    public static boolean isOk(int r, int c) { // 구역 확인
        return r >= 0 && r < n && c >= 0 && c < m && !visited[r][c] && matrix[r][c] != 0;
    }

    public static void bfs(int r, int c) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        int area = 1;
        while (!queue.isEmpty()) {
            curPoint = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nr = curPoint[0] + dr[i];
                int nc = curPoint[1] + dc[i];
                if (isOk(nr, nc)) {
                    queue.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                    area++;
                }
            }
        }
        answerArea = Math.max(answerArea, area);
    }
}