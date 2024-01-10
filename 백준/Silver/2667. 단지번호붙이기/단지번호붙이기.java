import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int[][] board;
    static boolean[][] visited;
    static final int[][] DIR = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int count;
    static List<Integer> result;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String data = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = data.charAt(j) - '0';
            }
        }
    }
    
    static void process() throws IOException {
        result = new ArrayList<>();
        visited = new boolean[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1 && !visited[r][c]) {
                    count = 0;
                    visited[r][c] = true;
                    recur(r, c);
                    result.add(count);
                }
            }
        }
        bw.write(result.size() + "\n");
        Collections.sort(result);
        for (int r : result) {
            bw.write(r + "\n");
        }
    }
    
    static void recur(int r, int c) {
        count++;
        for (int d = 0; d < 4; d++) {
            int nr = r + DIR[d][0];
            int nc = c + DIR[d][1];
            if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                continue;
            }
            if (board[nr][nc] != 1 || visited[nr][nc]) {
                continue;
            }
            visited[nr][nc] = true;
            recur(nr, nc);
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