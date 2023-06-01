import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, length, nowRow, nowCol, targetRow, targetCol; // 4 <= length <= 300

    // process
    static int nextRow, nextCol;
    static int[] dr = {2, 1, -1, -2, -2, -1, 1, 2}, dc = {1, 2, 2, 1, -1, -2, -2, -1}; // 8방향
    static int[] currentPositions;
    static int[][] matrix;
    static boolean[][] visited;
    static Queue<int[]> queue;

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            length = Integer.parseInt(br.readLine());
            matrix = new int[length][length];
            visited = new boolean[length][length];
            st = new StringTokenizer(br.readLine());
            nowRow = Integer.parseInt(st.nextToken());
            nowCol = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            targetRow = Integer.parseInt(st.nextToken());
            targetCol = Integer.parseInt(st.nextToken());

            for (int i = 0; i < length; i++) Arrays.fill(matrix[i], -1); // -1로 초기화
            matrix[nowRow][nowCol] = 1; // 시작점
            matrix[targetRow][targetCol] = 0; // 도착점
            queue = new LinkedList<>();
            queue.add(new int[]{nowRow, nowCol, 0}); // 시작점, 이동횟수
            bfs();
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void bfs() {
        while (!queue.isEmpty()) {
            currentPositions = queue.poll();
            nowRow = currentPositions[0];
            nowCol = currentPositions[1];
            answer = currentPositions[2];

            if (nowRow == targetRow && nowCol == targetCol) return; // 종료

            for (int i = 0; i < 8; i++) {
                nextRow = nowRow + dr[i];
                nextCol = nowCol + dc[i];

                if (nextRow >= 0 && nextRow < length && nextCol >= 0 && nextCol < length && !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;
                    queue.add(new int[]{nextRow, nextCol, answer + 1});
                }
            }
        }
    }
}