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
                
                if (nextRow < 0 || nextRow >= N) {
                    continue;
                }
                if (nextCol < 0 || nextCol >= M) {
                    continue;
                }
                if (nextCnt >= dist[nextRow][nextCol]) {
                    continue;
                }
                if (board[nextRow][nextCol] == 0) {
                    continue;
                }
                
                queue.add(new Location(nextRow, nextCol, nextCnt));
                dist[nextRow][nextCol] = nextCnt;
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (board[i][j] == 0) {
                    bw.write(0 + " ");
                    continue;
                }
                if (dist[i][j] == Integer.MAX_VALUE) {
                    bw.write(-1 + " ");
                    continue;
                }
                bw.write(dist[i][j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}