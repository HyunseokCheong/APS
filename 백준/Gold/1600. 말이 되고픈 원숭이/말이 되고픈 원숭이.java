import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int k, w, h;
    static int[][] map;

    // process
    static int nowR, nowC, count,nowK,nextR, nextC;
    static int[] now;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    static int[] hr = {-2, -2, -1, -1, 1, 1, 2, 2}, hc = {-1, 1, -2, 2, -2, 2, -1, 1};
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][][] visited;

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        k = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        map = new int[h][w];
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean[h][w][k + 1];

        // process
        answer = bfs();

        // write
        bw.write(answer == Integer.MAX_VALUE ? "-1" : answer + "");
        bw.flush();
        bw.close();
    }

    public static int bfs() {
        queue.add(new int[]{0, 0, 0, k});
        visited[0][0][k] = true;

        while (!queue.isEmpty()) {
            now = queue.poll();
            nowR = now[0];
            nowC = now[1];
            count = now[2];
            nowK = now[3];
            if (nowR == h - 1 && nowC == w - 1) return count;

            for (int i = 0; i < 4; i++) {
                nextR = nowR + dr[i];
                nextC = nowC + dc[i];
                if (nextR >= 0 && nextC >= 0 && nextR < h && nextC < w && !visited[nextR][nextC][nowK] && map[nextR][nextC] == 0) {
                    visited[nextR][nextC][nowK] = true;
                    queue.add(new int[]{nextR, nextC, count + 1, nowK});
                }
            }
            if (nowK > 0) {
                for (int i = 0; i < 8; i++) {
                    nextR = nowR + hr[i];
                    nextC = nowC + hc[i];
                    if (nextR >= 0 && nextC >= 0 && nextR < h && nextC < w && !visited[nextR][nextC][nowK - 1] && map[nextR][nextC] == 0) {
                        visited[nextR][nextC][nowK - 1] = true;
                        queue.add(new int[]{nextR, nextC, count + 1, nowK - 1});
                    }
                }
            }
        }
        return -1;
    }
}