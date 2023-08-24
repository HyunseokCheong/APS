package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_17413 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int R, C, M;
    static int row, col, speed, dir, size;
    static int fisher, result;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    static Shark[][] board;
    
    static class Shark {
        int row, col, speed, dir, size;
        
        public Shark(int row, int col, int speed, int dir, int size) {
            this.row = row;
            this.col = col;
            this.speed = speed;
            this.dir = dir;
            this.size = size;
        }
    }
    
    static void init() throws IOException {
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new Shark[R][C];
        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken()) - 1;
            col = Integer.parseInt(st.nextToken()) - 1;
            speed = Integer.parseInt(st.nextToken());
            dir = Integer.parseInt(st.nextToken()) - 1;
            size = Integer.parseInt(st.nextToken());
            
            board[row][col] = new Shark(row, col, speed, dir, size);
        }
        fisher = -1;
        result = 0;
    }
    
    static void moveFisher() {
        fisher++;
    }
    
    static void catchShark() {
        for (int i = 0; i < R; i++) {
            if (board[i][fisher] != null) {
                result += board[i][fisher].size;
                board[i][fisher] = null;
                return;
            }
        }
    }
    
    static Shark newLocateShark(Shark shark) {
        int row = shark.row;
        int col = shark.col;
        int speed = shark.speed;
        int dir = shark.dir;
        
        for (int i = 0; i < speed; i++) {
            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];
            
            if (nextRow < 0 || nextRow >= R || nextCol < 0 || nextCol >= C) {
                if (dir == 0) dir = 1;
                else if (dir == 1) dir = 0;
                else if (dir == 2) dir = 3;
                else dir = 2;
                
                nextRow = row + dr[dir];
                nextCol = col + dc[dir];
            }
            
            row = nextRow;
            col = nextCol;
        }
        
        return new Shark(row, col, speed, dir, shark.size);
    }
    
    static void moveShark() {
        Shark[][] newBoard = new Shark[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (board[i][j] != null) {
                    Shark movedShark = newLocateShark(board[i][j]);
                    if (newBoard[movedShark.row][movedShark.col] == null
                            || newBoard[movedShark.row][movedShark.col].size < movedShark.size) {
                        newBoard[movedShark.row][movedShark.col] = movedShark;
                    }
                }
            }
        }
        board = newBoard;
    }
    
    public static void main(String[] args) throws IOException {
        init();
        for (int i = 0; i < C; i++) {
            moveFisher();
            catchShark();
            moveShark();
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
