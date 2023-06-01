import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // read
    static int t, r, c;
    static char[][] matrix;

    // process
    static boolean alive;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    static Queue<int[]> sQueue;
    static Queue<int[]> fQueue;
    static int[][] sDist, fDist;

    // write

    public static void main(String[] args) throws IOException {
        // read
        t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            alive = false;
            st = new StringTokenizer(br.readLine());
            c = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            matrix = new char[r][c];
            sDist = new int[r][c];
            fDist = new int[r][c];
            sQueue = new LinkedList<>();
            fQueue = new LinkedList<>();
            for (int i = 0; i < r; i++) {
                matrix[i] = br.readLine().toCharArray();
                Arrays.fill(sDist[i], -1);
                Arrays.fill(fDist[i], -1);
                for (int j = 0; j < c; j++) {
                    if (matrix[i][j] == '@') {
                        sQueue.add(new int[]{i, j});
                        sDist[i][j] = 0;
                    } else if (matrix[i][j] == '*') {
                        fQueue.add(new int[]{i, j});
                        fDist[i][j] = 0;
                    }
                }
            }

            // process
            // fire
            while (!fQueue.isEmpty()) {
                int[] cur = fQueue.poll();
                for (int d = 0; d < 4; d++) {
                    int nr = cur[0] + dr[d], nc = cur[1] + dc[d];
                    if (nr < 0 || nr >= r || nc < 0 || nc >= c) continue;
                    if (fDist[nr][nc] >= 0 || matrix[nr][nc] == '#') continue;
                    fDist[nr][nc] = fDist[cur[0]][cur[1]] + 1;
                    fQueue.add(new int[]{nr, nc});
                }
            }
            // jihun
            while (!sQueue.isEmpty()) {
                int[] cur = sQueue.poll();
                for (int d = 0; d < 4; d++) {
                    int nr = cur[0] + dr[d], nc = cur[1] + dc[d];
                    if (nr < 0 || nr >= r || nc < 0 || nc >= c) {
                        bw.write(sDist[cur[0]][cur[1]] + 1 + "\n");
                        alive = true;
                        break;
                    }
                    if (sDist[nr][nc] >= 0 || matrix[nr][nc] == '#') continue;
                    if (fDist[nr][nc] != -1 && fDist[nr][nc] <= sDist[cur[0]][cur[1]] + 1) continue;
                    sDist[nr][nc] = sDist[cur[0]][cur[1]] + 1;
                    sQueue.add(new int[]{nr, nc});
                }
                if (alive) break;
            }
            // write
            if (!alive) bw.write("IMPOSSIBLE\n");
        }
        bw.flush();
        bw.close();
    }
}