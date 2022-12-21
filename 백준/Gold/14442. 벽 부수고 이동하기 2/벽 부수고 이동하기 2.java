import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String input;
    static int n, m, k, nowR, nowC, nowK, nextR, nextC, nextK, answer;
    static int[] now, dr, dc;
    static int[][] map;
    static int[][][] visited;
    static Queue<int[]> queue;

    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }
        visited = new int[n][m][k + 1];
    }

    static void solve() throws IOException {
        answer = -1;
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        queue = new LinkedList<>();
        bfs();

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static void bfs() {
        queue.add(new int[]{0, 0, k});
        visited[0][0][k] = 1;

        while (!queue.isEmpty()) {
            now = queue.poll();
            nowR = now[0];
            nowC = now[1];
            nowK = now[2];

            if (nowR == n - 1 && nowC == m - 1) {
                answer = visited[nowR][nowC][nowK];
                return;
            }

            for (int i = 0; i < 4; i++) {
                nextR = nowR + dr[i];
                nextC = nowC + dc[i];
                nextK = nowK;

                if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= m) continue;
                if (map[nextR][nextC] == 1) {
                    if (nextK == 0) continue;
                    nextK--;
                }
                if (visited[nextR][nextC][nextK] != 0) continue;

                visited[nextR][nextC][nextK] = visited[nowR][nowC][nowK] + 1;
                queue.add(new int[]{nextR, nextC, nextK});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
    }
}