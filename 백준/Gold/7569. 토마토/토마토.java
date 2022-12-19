import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int col, row, level;
    static int[][][] matrix;

    // process
    static int nowLevel, nowRow, nowCol, nextLevel, nextRow, nextCol;
    static int[] dl = {0, 0, 0, 0, -1, 1}, dr = {-1, 1, 0, 0, 0, 0}, dc = {0, 0, -1, 1, 0, 0}; // 상하좌우위아래
    static int[] currentPositions;
    static Queue<int[]> queue;

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());
        level = Integer.parseInt(st.nextToken());

        matrix = new int[level][row][col];
        queue = new LinkedList<>();

        // process
        for (int l = 0; l < level; l++) {
            for (int r = 0; r < row; r++) {
                st = new StringTokenizer(br.readLine());
                for (int c = 0; c < col; c++) {
                    matrix[l][r][c] = Integer.parseInt(st.nextToken());
                    if (matrix[l][r][c] == 1) {
                        queue.add(new int[]{l, r, c});
                    }
                }
            }
        }

        // write
        if (bfs()) bw.write(answer + "\n");
        else bw.write("-1\n");
        bw.flush();
        bw.close();
    }

    public static boolean bfs() {
        while (!queue.isEmpty()) {
            currentPositions = queue.poll();
            nowLevel = currentPositions[0];
            nowRow = currentPositions[1];
            nowCol = currentPositions[2];

            for (int i = 0; i < 6; i++) {
                nextLevel = nowLevel + dl[i];
                nextRow = nowRow + dr[i];
                nextCol = nowCol + dc[i];

                if (nextLevel < 0 || nextLevel >= level || nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col)
                    continue;
                if (matrix[nextLevel][nextRow][nextCol] == 0) {
                    queue.add(new int[]{nextLevel, nextRow, nextCol});
                    matrix[nextLevel][nextRow][nextCol] = matrix[nowLevel][nowRow][nowCol] + 1;
                    answer = Math.max(answer, matrix[nextLevel][nextRow][nextCol] - 1);
                }
            }
        }
        
        answer = Integer.MIN_VALUE;
        for (int l = 0; l < level; l++) {
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (matrix[l][r][c] == 0) return false;
                    answer = Math.max(answer, matrix[l][r][c] - 1);
                }
            }
        }
        return true;
    }
}