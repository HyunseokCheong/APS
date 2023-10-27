import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[][] board;
    static int MINUS_ONE, ZERO, ONE;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    static boolean checkSameColor(int row, int col, int size) {
        int color = board[row][col];
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (color != board[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    static void separate(int row, int col, int size) {
        if (checkSameColor(row, col, size)) {
            if (board[row][col] == -1) {
                MINUS_ONE++;
            }
            if (board[row][col] == 0) {
                ZERO++;
            }
            if (board[row][col] == 1) {
                ONE++;
            }
            return;
        }
        
        int newSize = size / 3;
        separate(row, col, newSize);
        separate(row, col + newSize, newSize);
        separate(row, col + newSize * 2, newSize);
        separate(row + newSize, col, newSize);
        separate(row + newSize, col + newSize, newSize);
        separate(row + newSize, col + newSize * 2, newSize);
        separate(row + newSize * 2, col, newSize);
        separate(row + newSize * 2, col + newSize, newSize);
        separate(row + newSize * 2, col + newSize * 2, newSize);
    }
    
    static void process() throws IOException {
        MINUS_ONE = 0;
        ZERO = 0;
        ONE = 0;
        separate(0, 0, n);
        bw.write(MINUS_ONE + "\n" + ZERO + "\n" + ONE + "\n");
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