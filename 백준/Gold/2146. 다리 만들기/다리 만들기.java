import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, nowLandNum, nowR, nowC, nextR, nextC, landNum, nowCount, answer;
    static int[] now, dr, dc;
    static int[][] map;
    static boolean[][] visited;
    static Queue<int[]> queue;

    static void read() throws IOException {
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        for (int r = 0; r < n; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < n; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void solve() throws IOException {
        answer = Integer.MAX_VALUE;
        landNum = 1;
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        queue = new LinkedList<>();
        visited = new boolean[n][n];

        // 섬에 각각 다른 번호를 붙여준다.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (map[r][c] == 1 && !visited[r][c]) {
                    setLand(r, c);
                }
            }
        }
        // 다리 설치 + 최소 개수 갱신
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (map[r][c] != 0) {
                    visited = new boolean[n][n];
                    setBridge(r, c);
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    static void setLand(int r, int c) {
        queue.add(new int[]{r, c});
        visited[r][c] = true;
        map[r][c] = landNum;
        while (!queue.isEmpty()) {
            now = queue.poll();
            nowR = now[0];
            nowC = now[1];
            for (int i = 0; i < 4; i++) {
                nextR = nowR + dr[i];
                nextC = nowC + dc[i];
                if ((nextR >= 0 && nextR < n && nextC >= 0 && nextC < n) && map[nextR][nextC] == 1 && !visited[nextR][nextC]) {
                    queue.add(new int[]{nextR, nextC});
                    visited[nextR][nextC] = true;
                    map[nextR][nextC] = landNum;
                }
            }
        }
        landNum++;
    }

    static void setBridge(int r, int c) {
        nowLandNum = map[r][c];
        queue.add(new int[]{r, c, 0});
        visited[r][c] = true;

        while (!queue.isEmpty()) {
            now = queue.poll();
            nowR = now[0];
            nowC = now[1];
            nowCount = now[2];


            for (int i = 0; i < 4; i++) {
                nextR = nowR + dr[i];
                nextC = nowC + dc[i];

                // 벗어남, 왔던 곳, 같은 섬
                if (nextR < 0 || nextR >= n || nextC < 0 || nextC >= n) continue;
                if (visited[nextR][nextC]) continue;
                if (map[nextR][nextC] == nowLandNum) continue;

                visited[nextR][nextC] = true;
                // 바다, 다른 섬
                if (map[nextR][nextC] == 0) {
                    queue.add(new int[]{nextR, nextC, nowCount + 1});
                } else {
                    answer = Math.min(answer, nowCount);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
    }
}