import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[][] board;
    static boolean[][] visited;
    
    static class Node {
        int row, col, cnt;
        
        public Node(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    static PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cnt - o2.cnt);
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int result;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(input[j]);
            }
        }
        
        result = Integer.MAX_VALUE;
        pq.add(new Node(0, 0, 0));
        visited[0][0] = true;
        
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            
            if (node.row == n - 1 && node.col == n - 1) {
                result = Math.min(result, node.cnt);
            }
            
            
            for (int i = 0; i < 4; i++) {
                int nextRow = node.row + dr[i];
                int nextCol = node.col + dc[i];
                
                if (nextRow < 0 || nextRow == n || nextCol < 0 || nextCol == n) {
                    continue;
                }
                if (visited[nextRow][nextCol]) {
                    continue;
                }
                if (board[nextRow][nextCol] == 0) {
                    pq.add(new Node(nextRow, nextCol, node.cnt + 1));
                    visited[nextRow][nextCol] = true;
                    continue;
                }
                
                pq.add(new Node(nextRow, nextCol, node.cnt));
                visited[nextRow][nextCol] = true;
            }
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}