import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[][] map;

    // process
    static int nowRow, nowCol, nowCount, nextRow, nextCol;
    static int[] dr, dc, curPos;
    static boolean[][] visited;
    static Queue<int[]> queue;

    // write
    static int answer;
    static int[] answerArr;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        // process
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        visited = new boolean[n][n];
        queue = new LinkedList<>();
        answer = 0;
        answerArr = new int[625];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (map[r][c] == 1 && !visited[r][c]) {
                    bfs(r, c);
                    answer++;
                }
            }
        }
        // write
        bw.write(answer + "\n");
        Arrays.sort(answerArr, 0, answer);
        for (int i = 0; i < answer; i++) bw.write(answerArr[i] + "\n");
        bw.flush();
        bw.close();
    }

    public static void bfs(int r, int c) {
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        answerArr[answer]++;

        while (!queue.isEmpty()) {
            curPos = queue.poll();
            nowRow = curPos[0];
            nowCol = curPos[1];

            for (int i = 0; i < 4; i++) {
                nextRow = nowRow + dr[i];
                nextCol = nowCol + dc[i];

                if (0 <= nextRow && nextRow < n && 0 <= nextCol && nextCol < n) {
                    if (map[nextRow][nextCol] == 1 && !visited[nextRow][nextCol]) {
                        queue.add(new int[]{nextRow, nextCol});
                        visited[nextRow][nextCol] = true;
                        answerArr[answer]++;
                    }
                }
            }
        }
    }
}