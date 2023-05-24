import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int level, row, col;
    static char[][][] matrix;

    // process
    static int nowLevel, nowRow, nowCol, nextLevel, nextRow, nextCol;
    static int[] dl = {0, 0, 0, 0, -1, 1}, dr = {-1, 1, 0, 0, 0, 0}, dc = {0, 0, -1, 1, 0, 0}; // 상하좌우 위아래
    static int[] currentPositions;
    static int[][][] visited;
    static Queue<int[]> queue;

    // write
    static int escapeTime;
    static boolean isEscape;

    public static void main(String[] args) throws IOException {
        // read
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            level = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());

            if (level == 0 && row == 0 && col == 0) break; // 종료 조건

            matrix = new char[level][row][col];
            visited = new int[level][row][col];
            queue = new LinkedList<>();
            escapeTime = 0;
            isEscape = false;

            // 지도, 방문 초기화 + 시작점 설정
            for (int l = 0; l < level; l++) {
                for (int r = 0; r < row; r++) {
                    matrix[l][r] = br.readLine().toCharArray();
                    for (int c = 0; c < col; c++) {
                        visited[l][r][c] = -1;
                        if (matrix[l][r][c] == 'S') {
                            nowLevel = l;
                            nowRow = r;
                            nowCol = c;
                        }
                    }
                }
                br.readLine();
            }

            // process
            bfs();

            // write
            if (isEscape) bw.write("Escaped in " + escapeTime + " minute(s)." + "\n");
            else bw.write("Trapped!" + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs() {
        queue.add(new int[]{nowLevel, nowRow, nowCol});
        visited[nowLevel][nowRow][nowCol] = 0;

        while (!queue.isEmpty()) {
            currentPositions = queue.poll();
            nowLevel = currentPositions[0];
            nowRow = currentPositions[1];
            nowCol = currentPositions[2];

            for (int d = 0; d < 6; d++) {
                nextLevel = nowLevel + dl[d];
                nextRow = nowRow + dr[d];
                nextCol = nowCol + dc[d];

                if (isOk(nextLevel, nextRow, nextCol)) {
                    if (matrix[nextLevel][nextRow][nextCol] == 'E') {
                        isEscape = true;
                        escapeTime = visited[nowLevel][nowRow][nowCol] + 1;
                        break;
                    }
                    queue.add(new int[]{nextLevel, nextRow, nextCol});
                    visited[nextLevel][nextRow][nextCol] = visited[nowLevel][nowRow][nowCol] + 1;
                }
            }
            if (isEscape) break;
        }
    }

    public static boolean isOk(int nextLevel, int nextRow, int nextCol) {
        return nextLevel >= 0 && nextLevel < level && nextRow >= 0 && nextRow < row && nextCol >= 0 && nextCol < col
                && matrix[nextLevel][nextRow][nextCol] != '#' && visited[nextLevel][nextRow][nextCol] == -1;
    }
}