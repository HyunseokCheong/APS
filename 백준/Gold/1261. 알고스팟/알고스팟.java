import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int n, m;
    static int[][] board;
    static boolean[][] visited;
    static int count;
    static PriorityQueue<Point> pq;
    
    static class Point {
        int row, col, cnt;
        
        Point(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }
        br.close();
        
        count = Integer.MAX_VALUE;
        pq = new PriorityQueue<>((o1, o2) -> o1.cnt - o2.cnt);
        visited = new boolean[n][m];
        pq.add(new Point(0, 0, 0));
        visited[0][0] = true;
        while (!pq.isEmpty()) {
            Point p = pq.poll();
            
            if (p.row == n - 1 && p.col == m - 1) {
                count = Math.min(count, p.cnt);
                break;
            }
            
            for (int i = 0; i < 4; i++) {
                int nextRow = p.row + dr[i];
                int nextCol = p.col + dc[i];
                
                if (nextRow < 0 || nextRow == n || nextCol < 0 || nextCol == m) {
                    continue;
                }
                if (visited[nextRow][nextCol]) {
                    continue;
                }
                if (board[nextRow][nextCol] == 0) {
                    pq.offer(new Point(nextRow, nextCol, p.cnt));
                    visited[nextRow][nextCol] = true;
                    continue;
                }
                pq.offer(new Point(nextRow, nextCol, p.cnt + 1));
                visited[nextRow][nextCol] = true;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}