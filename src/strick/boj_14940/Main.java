package strick.boj_14940;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int M;
    static int[][] board;
    static int[][] dist;
    static Queue<Location> queue;
    static Location startLocation;
    static int[] dr = new int[]{-1, 1, 0, 0};
    static int[] dc = new int[]{0, 0, -1, 1};
    
    static class Location {
        int row;
        int col;
        int cnt;
        
        public Location(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j] = Integer.MAX_VALUE;
                
                if (board[i][j] == 2) {
                    startLocation = new Location(i, j, 0);
                }
            }
        }
        
        queue = new LinkedList<>();
        queue.add(startLocation);
        dist[startLocation.row][startLocation.col] = 0;
        while (!queue.isEmpty()) {
            Location nowLocation = queue.poll();
            int row = nowLocation.row;
            int col = nowLocation.col;
            int cnt = nowLocation.cnt;
            
            for (int i = 0; i < 4; i++) {
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];
                int nextCnt = cnt + 1;
                
                if (!isValid(nextRow, nextCol, nextCnt)) {
                    continue;
                }
                
                queue.add(new Location(nextRow, nextCol, nextCnt));
                dist[nextRow][nextCol] = nextCnt;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int answer = board[i][j] == 0 ? 0 : dist[i][j] == Integer.MAX_VALUE ? -1 : dist[i][j];
                bw.write(answer + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
    static boolean isValid(int nextRow, int nextCol, int nextCnt) {
        return !(nextRow < 0
                || nextRow >= N
                || nextCol < 0
                || nextCol >= M
                || nextCnt >= dist[nextRow][nextCol]
                || board[nextRow][nextCol] == 0);
    }
}
