package strick.boj_2589;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int R;
    static int C;
    static char[][] board;
    static int[][] dist;
    static boolean[][] visited;
    static int maxDist;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            board[i] = br.readLine().toCharArray();
        }
    }
    
    static void process() {
        maxDist = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] == 'W') {
                    continue;
                }
                dist = new int[R][C];
                visited = new boolean[R][C];
                bfs(i, j);
            }
        }
    }
    
    static void bfs(int r, int c) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{r, c, 0});
        visited[r][c] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curR = cur[0];
            int curC = cur[1];
            int curDist = cur[2];
            for (int i = 0; i < 4; i++) {
                int nextR = curR + dr[i];
                int nextC = curC + dc[i];
                int nextDist = curDist + 1;
                
                if (nextR < 0 || nextR >= R || nextC < 0 || nextC >= C) {
                    continue;
                }
                if (board[nextR][nextC] == 'W') {
                    continue;
                }
                if (dist[nextR][nextC] >= nextDist) {
                    continue;
                }
                if (visited[nextR][nextC]) {
                    continue;
                }
                
                queue.add(new int[]{nextR, nextC, nextDist});
                visited[nextR][nextC] = true;
                dist[nextR][nextC] = nextDist;
                maxDist = Math.max(maxDist, nextDist);
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(maxDist + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}
