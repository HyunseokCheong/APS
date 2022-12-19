import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, fieldCol, fieldRow, cabbageNum, cabbageCol, cabbageRow;
    static int[][] field;

    // process
    static int nr, nc;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1}, currentPosition;
    static boolean[][] visited;
    static Queue<int[]> queue;

    static void bfs(int r, int c) {
        queue.add(new int[]{r, c});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            currentPosition = queue.poll();
            for (int i = 0; i < 4; i++) {
                nr = currentPosition[0] + dr[i];
                nc = currentPosition[1] + dc[i];
                if (nr >= 0 && nr < fieldRow && nc >= 0 && nc < fieldCol && field[nr][nc] == 1 && !visited[nr][nc]) {
                    queue.add(new int[]{nr, nc});
                    visited[nr][nc] = true;
                }
            }
        }
    }

    // write
    static int needWorm;

    public static void main(String[] args) throws IOException {
        // read
        testCase = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCase; t++) {
            st = new StringTokenizer(br.readLine());
            fieldCol = Integer.parseInt(st.nextToken());
            fieldRow = Integer.parseInt(st.nextToken());
            cabbageNum = Integer.parseInt(st.nextToken());

            // 배추 심기
            field = new int[fieldRow][fieldCol];
            for (int c = 0; c < cabbageNum; c++) {
                st = new StringTokenizer(br.readLine());
                cabbageCol = Integer.parseInt(st.nextToken());
                cabbageRow = Integer.parseInt(st.nextToken());
                field[cabbageRow][cabbageCol] = 1;
            }

            visited = new boolean[fieldRow][fieldCol];
            queue = new LinkedList<>();
            needWorm = 0;

            // process
            for (int r = 0; r < fieldRow; r++) {
                for (int c = 0; c < fieldCol; c++) {
                    if (field[r][c] == 1 && !visited[r][c]) {
                        needWorm++;
                        bfs(r, c);
                    }
                }
            }

            // write
            bw.write(needWorm + "\n");
        }
        bw.flush();
        bw.close();
    }
}