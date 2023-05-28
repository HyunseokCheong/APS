import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // read
    static int r, c;
    static char[][] matrix;

    // process
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    static Queue<int[]> jQueue = new LinkedList<>();
    static Queue<int[]> fQueue = new LinkedList<>();
    static int[][] jDist, fDist;

    // write

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        matrix = new char[r][c];
        jDist = new int[r][c];
        fDist = new int[r][c];
        for (int i = 0; i < r; i++) {
            matrix[i] = br.readLine().toCharArray();
            Arrays.fill(jDist[i], -1);
            Arrays.fill(fDist[i], -1);
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 'J') {
                    jQueue.add(new int[]{i, j});
                    jDist[i][j] = 0;
                } else if (matrix[i][j] == 'F') {
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
        while (!jQueue.isEmpty()) {
            int[] cur = jQueue.poll();
            for (int d = 0; d < 4; d++) {
                int nr = cur[0] + dr[d], nc = cur[1] + dc[d];
                if (nr < 0 || nr >= r || nc < 0 || nc >= c) {
                    bw.write(jDist[cur[0]][cur[1]] + 1 + "");
                    bw.flush();
                    bw.close();
                    return;
                }
                if (jDist[nr][nc] >= 0 || matrix[nr][nc] == '#') continue;
                if (fDist[nr][nc] != -1 && fDist[nr][nc] <= jDist[cur[0]][cur[1]] + 1) continue;
                jDist[nr][nc] = jDist[cur[0]][cur[1]] + 1;
                jQueue.add(new int[]{nr, nc});
            }
        }
        // write
        bw.write("IMPOSSIBLE");
        bw.flush();
        bw.close();
    }
}