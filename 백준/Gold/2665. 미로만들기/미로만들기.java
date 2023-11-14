import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static char[][] board;
    static boolean[][] visited;
    static PriorityQueue<Point> pq;
    
    static class Point {
        int row;
        int col;
        int use;
        
        public Point(int row, int col, int use) {
            this.row = row;
            this.col = col;
            this.use = use;
        }
    }
    
    static void solve() throws IOException {
        pq = new PriorityQueue<>((p1, p2) -> p1.use - p2.use);
        visited = new boolean[n][n];
        pq.add(new Point(0, 0, 0));
        visited[0][0] = true;
        while (!pq.isEmpty()) {
            Point point = pq.poll();
            int cr = point.row;
            int cc = point.col;
            int cu = point.use;
            if (cr == n - 1 && cc == n - 1) {
                bw.write(cu + "\n");
                return;
            }
            for (int i = 0; i < 4; i++) {
                int nr = cr + dir[i][0];
                int nc = cc + dir[i][1];
                int nu = cu;
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (board[nr][nc] == '0') {
                    nu++;
                }
                pq.add(new Point(nr, nc, nu));
                visited[nr][nc] = true;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        solve();
        bw.flush();
        bw.close();
    }
}