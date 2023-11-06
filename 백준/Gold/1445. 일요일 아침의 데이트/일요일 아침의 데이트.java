import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static boolean[][] visited;
    static char[][] board;
    static PriorityQueue<Point> points;
    
    static class Point {
        int row, col, onTrash, nextTrash;
        
        public Point(int row, int col, int onTrash, int nextTrash) {
            this.row = row;
            this.col = col;
            this.onTrash = onTrash;
            this.nextTrash = nextTrash;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }
        // 쓰레기 인접 표시
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'g') {
                    for (int k = -1; k < 2; k++) {
                        for (int l = -1; l < 2; l++) {
                            if (k != 0 && l != 0) {
                                continue;
                            }
                            int row = i + k;
                            int col = j + l;
                            if (row < 0 || row >= n || col < 0 || col >= m) {
                                continue;
                            }
                            if (board[row][col] != '.') {
                                continue;
                            }
                            board[row][col] = 'b';
                        }
                    }
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(Arrays.toString(board[i]));
//        }
    }
    
    static void process() throws IOException {
        points = new PriorityQueue<>((p1, p2) -> {
            if (p1.onTrash == p2.onTrash) {
                return p1.nextTrash - p2.nextTrash;
            }
            return p1.onTrash - p2.onTrash;
        });
        visited = new boolean[n][m];
        Point start = new Point(0, 0, 0, 0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'S') {
                    start = new Point(i, j, 0, 0);
                }
            }
        }
        
        points.add(start);
        visited[start.row][start.col] = true;
        while (!points.isEmpty()) {
            Point point = points.poll();
            int row = point.row;
            int col = point.col;
            int onTrash = point.onTrash;
            int nextTrash = point.nextTrash;
            
            if (board[row][col] == 'F') {
                bw.write(onTrash + " " + nextTrash + "\n");
                return;
            }
            
            for (int i = 0; i < 4; i++) {
                int nr = row + dr[i];
                int nc = col + dc[i];
                int not = onTrash;
                int nnt = nextTrash;
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (board[nr][nc] == 'g') {
                    not++;
                }
                if (board[nr][nc] == 'b') {
                    nnt++;
                }
                points.add(new Point(nr, nc, not, nnt));
                visited[nr][nc] = true;
            }
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