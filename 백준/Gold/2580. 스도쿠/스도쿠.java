import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 빈칸인 좌표만 따로 저장
 * 행, 열, 정사각형
 * 가능한지 고민하지 말고 빈칸 다 채울때까지 수행
 * 어짜피 가능한 경우만 끝 까지 도달한다.
 */
public class Main {
    
    static BufferedReader  br        = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw        = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl      = "\n";
    static String          blank     = " ";
    static int[][]         board     = new int[9][9];
    static List<Point>     pointList = new ArrayList<>();
    
    static class Point {
        
        int row;
        int col;
        
        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static void input() throws IOException {
        for (int r = 0; r < 9; r++) {
            stk();
            for (int c = 0; c < 9; c++) {
                board[r][c] = Integer.parseInt(st.nextToken());
                if (board[r][c] == 0) {
                    pointList.add(new Point(r, c));
                }
            }
        }
    }
    
    static void process() throws IOException {
        recur(0);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static boolean check(int row, int col, int A) {
        for (int c = 0; c < 9; c++) {
            if (A == board[row][c]) {
                return false;
            }
        }
        
        for (int r = 0; r < 9; r++) {
            if (A == board[r][col]) {
                return false;
            }
        }
        
        int newRow = (row / 3) * 3;
        int newCol = (col / 3) * 3;
        for (int r = newRow; r < newRow + 3; r++) {
            for (int c = newCol; c < newCol + 3; c++) {
                if (board[r][c] == A) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    static void recur(int depth) throws IOException {
        if (depth == pointList.size()) {
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    bw.write(board[r][c] + blank);
                }
                bw.write(endl);
            }
            bw.flush();
            bw.close();
            System.exit(0);
        }
        
        for (int i = 1; i < 10; i++) {
            int row = pointList.get(depth).row;
            int col = pointList.get(depth).col;
            
            if (check(row, col, i)) {
                board[row][col] = i;
                recur(depth + 1);
                board[row][col] = 0;
            }
        }
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}