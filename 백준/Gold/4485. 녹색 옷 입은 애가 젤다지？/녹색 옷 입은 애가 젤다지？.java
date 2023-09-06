import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t, n;
    static int[][] board;
    static int[][] dist;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cnt - o2.cnt);
    
    static class Node {
        int row, col, cnt;
        
        public Node(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    static void input() throws IOException {
        t = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            
            board = new int[n][n];
            dist = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
            
            pq.add(new Node(0, 0, board[0][0]));
            dist[0][0] = board[0][0];
            while (!pq.isEmpty()) {
                Node node = pq.poll();
                for (int i = 0; i < 4; i++) {
                    int nextRow = node.row + dr[i];
                    int nextCol = node.col + dc[i];
                    
                    if (nextRow < 0 || nextRow == n || nextCol < 0 || nextCol == n) {
                        continue;
                    }
                    
                    int nextCnt = node.cnt + board[nextRow][nextCol];
                    if (dist[nextRow][nextCol] <= nextCnt) {
                        continue;
                    }
                    
                    pq.add(new Node(nextRow, nextCol, nextCnt));
                    dist[nextRow][nextCol] = nextCnt;
                }
            }
            
            bw.write("Problem " + t + ": " + dist[n - 1][n - 1] + "\n");
            t++;
        }
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}