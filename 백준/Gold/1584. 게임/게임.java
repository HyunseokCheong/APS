import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static final int DANGER = 1;
    static final int DEATH = -1;
    static final int SIZE = 501;
    
    static int[][] board = new int[SIZE][SIZE];
    static boolean[][] visited = new boolean[SIZE][SIZE];
    static int result;
    
    static class Node {
        int row, col, cnt;
        
        public Node(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    
    static void solve() {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cnt - o2.cnt);
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        pq.add(new Node(0, 0, 0));
        visited[0][0] = true;
        board[0][0] = 0;
        
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            
            for (int i = 0; i < 4; i++) {
                int nextRow = node.row + dr[i];
                int nextCol = node.col + dc[i];
                
                if (nextRow >= 0 && nextRow < SIZE && nextCol >= 0 && nextCol < SIZE) {
                    if (!visited[nextRow][nextCol] && board[nextRow][nextCol] != DEATH) {
                        board[nextRow][nextCol] += node.cnt;
                        visited[nextRow][nextCol] = true;
                        pq.add(new Node(nextRow, nextCol, board[nextRow][nextCol]));
                    }
                }
            }
        }
        result = visited[SIZE - 1][SIZE - 1] ? board[SIZE - 1][SIZE - 1] : -1;
    }
    
    static void output() throws IOException {
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    static void setBoard(int type) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            
            for (int j = Math.min(x1, x2); j <= Math.max(x1, x2); j++) {
                for (int k = Math.min(y1, y2); k <= Math.max(y1, y2); k++) {
                    board[j][k] = type;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        setBoard(DANGER);
        setBoard(DEATH);
        solve();
        output();
    }
}