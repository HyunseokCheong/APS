import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int n, m, result;
    static int[][] board;
    static int[][][] dist;
    static PriorityQueue<Node> nodes;
    
    static class Node {
        int row, col, use;
        
        public Node(int row, int col, int use) {
            this.row = row;
            this.col = col;
            this.use = use;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        dist = new int[n][m][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                dist[i][j][0] = Integer.MAX_VALUE;
                dist[i][j][1] = Integer.MAX_VALUE;
            }
        }
    }
    
    static void process() throws IOException {
        nodes = new PriorityQueue<>((o1, o2) -> o1.use - o2.use);
        result = Integer.MAX_VALUE;
        
        nodes.add(new Node(0, 0, 0));
        dist[0][0][0] = board[0][0];
        
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            int row = node.row;
            int col = node.col;
            int use = node.use;
            int level = dist[row][col][use];
            
            for (int i = 0; i < 4; i++) {
                int nextRow = row + dr[i];
                int nextCol = col + dc[i];
                
                if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) {
                    continue;
                }
                int nowLevel = Math.max(level, board[nextRow][nextCol]);
                if (dist[nextRow][nextCol][use] > nowLevel) {
                    dist[nextRow][nextCol][use] = nowLevel;
                    nodes.add(new Node(nextRow, nextCol, use));
                }
                if (use == 0) {
                    nextRow += dr[i];
                    nextCol += dc[i];
                    if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m) {
                        continue;
                    }
                    
                    nowLevel = Math.max(level, board[nextRow][nextCol]);
                    if (dist[nextRow][nextCol][use + 1] > nowLevel) {
                        dist[nextRow][nextCol][use + 1] = nowLevel;
                        nodes.add(new Node(nextRow, nextCol, use + 1));
                    }
                }
            }
        }
        result = Math.min(dist[n - 1][m - 1][0], dist[n - 1][m - 1][1]);
        bw.write(result + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}