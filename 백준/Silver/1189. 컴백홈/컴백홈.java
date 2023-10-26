import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int r, c, k, result;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static char[][] board;
    static boolean[][] visited;
    
    static class Point {
        int row, col, dist;
        
        public Point(int row, int col, int dist) {
            this.row = row;
            this.col = col;
            this.dist = dist;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        for (int i = 0; i < r; i++) {
            board[i] = br.readLine().toCharArray();
        }
    }
    
    static void process() throws IOException {
        Point point = new Point(r - 1, 0, 1);
        visited = new boolean[r][c];
        result = 0;
        
        visited[r - 1][0] = true;
        recur(point);
        bw.write(result + "\n");
    }
    
    static void recur(Point point) {
        int curDist = point.dist;
        int curRow = point.row;
        int curCol = point.col;
        
        if (curDist == k && curRow == 0 && curCol == c - 1) {
            result++;
            return;
        }
        if (curDist == k) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nextDist = curDist + 1;
            int nextRow = curRow + dr[i];
            int nextCol = curCol + dc[i];
            
            if (nextRow < 0 || nextRow == r || nextCol < 0 || nextCol == c) {
                continue;
            }
            if (visited[nextRow][nextCol]) {
                continue;
            }
            if (board[nextRow][nextCol] == 'T') {
                continue;
            }
            
            visited[nextRow][nextCol] = true;
            recur(new Point(nextRow, nextCol, nextDist));
            visited[nextRow][nextCol] = false;
        }
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