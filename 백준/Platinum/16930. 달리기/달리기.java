import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, k;
    static char[][] board;
    static int[][] vis;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int sr, sc, er, ec;

    static void bfs() {
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{sr, sc});

        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int cr = cur[0];
            int cc = cur[1];

            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= k; j++) {
                    int nr = cr + dr[i] * j;
                    int nc = cc + dc[i] * j;
                    if (nr >= 1 && nr <= n && nc >= 1 && nc <= m && board[nr][nc] == '.') {
                        if (vis[nr][nc] == 0) {
                            vis[nr][nc] = vis[cr][cc] + 1;
                            if (nr == er && nc == ec) {
                                return;
                            }
                            que.add(new int[]{nr, nc});
                        } else if (vis[nr][nc] <= vis[cr][cc]) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new char[n + 1][m + 1];
        vis = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            for (int j = 1; j <= m; j++) {
                board[i][j] = input.charAt(j - 1);
            }
        }
        st = new StringTokenizer(br.readLine());
        sr = Integer.parseInt(st.nextToken());
        sc = Integer.parseInt(st.nextToken());
        er = Integer.parseInt(st.nextToken());
        ec = Integer.parseInt(st.nextToken());

        bfs();
        if (vis[er][ec] == 0) vis[er][ec] = -1;
        bw.write(String.valueOf(vis[er][ec]));
        bw.flush();
        bw.close();
    }
}