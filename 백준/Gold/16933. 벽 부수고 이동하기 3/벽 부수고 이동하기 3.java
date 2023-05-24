import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String input;
    static int row, col, maxBreak, answer;
    static int nowRow, nowCol, nowBreak, nowDist, nowDay, nextRow, nextCol;
    static int[] dr, dc, now;
    static int[][] map;
    static boolean[][][][] visited;
    static Queue<int[]> queue;

    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        maxBreak = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        for (int r = 0; r < row; r++) {
            input = br.readLine();
            for (int c = 0; c < col; c++) {
                map[r][c] = input.charAt(c) - '0';
            }
        }
    }

    static void solve() throws IOException {
        answer = -1;
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        visited = new boolean[row][col][maxBreak + 1][2];
        queue = new LinkedList<>();
        bfs();

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    static void bfs() {
        queue.add(new int[]{0, 0, 0, 1, 0}); // row, col, break, dist, day
        visited[0][0][0][0] = true; // 낮 0 밤 1

        while (!queue.isEmpty()) {
            now = queue.poll();
            nowRow = now[0];
            nowCol = now[1];
            nowBreak = now[2];
            nowDist = now[3];
            nowDay = now[4];

            if (nowRow == row - 1 && nowCol == col - 1) {
                answer = nowDist;
                return;
            }

            for (int i = 0; i < 4; i++) {
                nextRow = nowRow + dr[i];
                nextCol = nowCol + dc[i];

                if (nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col) continue;
                if (visited[nextRow][nextCol][nowBreak][nowDay]) continue;


                if (map[nextRow][nextCol] == 0) {
                    if (nowDay == 0) {
                        if (!visited[nextRow][nextCol][nowBreak][1]) {
                            visited[nextRow][nextCol][nowBreak][1] = true;
                            queue.add(new int[]{nextRow, nextCol, nowBreak, nowDist + 1, 1});
                        }
                    } else {
                        if (!visited[nextRow][nextCol][nowBreak][0]) {
                            visited[nextRow][nextCol][nowBreak][0] = true;
                            queue.add(new int[]{nextRow, nextCol, nowBreak, nowDist + 1, 0});
                        }
                    }
                } else {
                    if (nowBreak < maxBreak) {
                        if (nowDay == 0) {
                            if (!visited[nextRow][nextCol][nowBreak + 1][1]) {
                                visited[nextRow][nextCol][nowBreak + 1][1] = true;
                                queue.add(new int[]{nextRow, nextCol, nowBreak + 1, nowDist + 1, 1});
                            }
                        } else {
                            if (!visited[nowRow][nowCol][nowBreak][0]) {
                                visited[nowRow][nowCol][nowBreak][0] = true;
                                queue.add(new int[]{nowRow, nowCol, nowBreak, nowDist + 1, 0});
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
    }
}