import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int r, c;
    static int[][] board;
    static int[][] dist;
    static boolean[][] near;
    static int result;
    static Queue<Node> queue;
    
    static class Node {
        int row, col, cnt;
        
        public Node(int row, int col, int cnt) {
            this.row = row;
            this.col = col;
            this.cnt = cnt;
        }
    }
    
    static Node start;
    static Node end;
    static final int WALL = 1;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    
    static void output() throws IOException {
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        checkNear();
        solve();
        output();
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        board = new int[r][c];
        dist = new int[r][c];
        for (int i = 0; i < r; i++) {
            String[] input = br.readLine().split("");
            Arrays.fill(dist[i], Integer.MAX_VALUE);
            for (int j = 0; j < c; j++) {
                if (input[j].equals("#")) {
                    board[i][j] = WALL;
                    continue;
                }
                
                if (input[j].equals("S")) {
                    start = new Node(i, j, 0);
                    continue;
                }
                
                if (input[j].equals("E")) {
                    end = new Node(i, j, 0);
                }
            }
        }
    }
    
    static void checkNear() {
        near = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == WALL) {
                    continue;
                }
                for (int d = 0; d < 4; d++) {
                    int nextRow = i + dr[d];
                    int nextCol = j + dc[d];
                    
                    if (nextRow < 0 || nextRow == r || nextCol < 0 || nextCol == c) {
                        continue;
                    }
                    
                    if (board[nextRow][nextCol] == WALL) {
                        near[i][j] = true;
                        break;
                    }
                }
            }
        }
    }
    
    static void solve() {
        result = Integer.MAX_VALUE;
        queue = new PriorityQueue<>((o1, o2) -> o1.cnt - o2.cnt);
        
        queue.add(start);
        dist[start.row][start.col] = 0;
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            if (node.row == end.row && node.col == end.col) {
                result = Math.min(result, node.cnt);
            }
            
            for (int i = 0; i < 4; i++) {
                int nextRow = node.row + dr[i];
                int nextCol = node.col + dc[i];
                
                if (nextRow < 0 || nextRow == r || nextCol < 0 || nextCol == c) {
                    continue;
                }
                
                if (board[nextRow][nextCol] == WALL) {
                    continue;
                }
                
                int nextCnt = wallToWall(node.row, node.col, nextRow, nextCol) ? node.cnt : node.cnt + 1;
                if (dist[nextRow][nextCol] <= nextCnt) {
                    continue;
                }
                
                queue.add(new Node(nextRow, nextCol, nextCnt));
                dist[nextRow][nextCol] = nextCnt;
            }
        }
    }
    
    static boolean wallToWall(int row, int col, int nextRow, int nextCol) {
        return near[row][col] && near[nextRow][nextCol];
    }
}