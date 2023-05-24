/**
 * board 10 * 10 고정
 * X : 구사과, O : 큐브러버
 * 0. 구사과 돌에서 연결된 곳에 돌 놓고 오(이상)목 됐는지 체크
 * 1. 가로, 세로, 대각선
 * 2. 구사과와 큐브러버의 돌 개수는 항상 일치함
 * 3. 시작하자 마자 5개인 경우? 어캄
 * 4. 5개 뿐 아니라 5개 이상이면
 *
 * @Author HyunseokCheong
 * @Date 2023-01-16
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static char[][] board;
    static boolean[][] visited;
    static String input;
    // 상 하 좌 우 우상 좌상 우하 좌하
    static int[] dr = {-1, 1, 0, 0, -1, -1, 1, 1}, dc = {0, 0, -1, 1, 1, -1, 1, -1};
    static int nowR, nowC, nextR, nextC, score;
    
    public static void main(String[] args) throws IOException {
        read();
        
        // solve
        if (isOMok()) {
            System.out.println(1);
            System.exit(0);
        }
        play();
        System.out.println(0);
    }
    
    static void read() throws IOException {
        board = new char[10][10];
        for (int i = 0; i < 10; i++) {
            input = br.readLine();
            for (int j = 0; j < 10; j++) {
                board[i][j] = input.charAt(j);
            }
        }
    }
    
    /**
     * X 찾아서 오목 확인
     *
     * @return 오목이면 true, 아니면 false
     */
    static boolean isOMok() {
        
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (board[r][c] == 'X') {
                    
                    loop1:
                    for (int dir = 0; dir < 8; dir++) {
                        score = 1;
                        nextR = r + dr[dir];
                        nextC = c + dc[dir];
                        
                        while (true) {
                            if (score >= 5) {
                                return true;
                            }
                            if (nextR < 0 || nextR > 9 || nextC < 0 || nextC > 9) {
                                continue loop1;
                            }
                            if (board[nextR][nextC] != 'X') {
                                continue loop1;
                            }
                            score++;
                            nextR += dr[dir];
                            nextC += dc[dir];
                        }
                    }
                }
            }
        }
        return false;
    }
    
    static void play() {
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                if (board[r][c] == 'X') {
                    for (int dir = 0; dir < 8; dir++) {
                        nextR = r + dr[dir];
                        nextC = c + dc[dir];
                        
                        if (nextR < 0 || nextR > 9 || nextC < 0 || nextC > 9) {
                            continue;
                        }
                        if (board[nextR][nextC] != '.') {
                            continue;
                        }
                        board[nextR][nextC] = 'X';
                        if (isOMok()) {
                            System.out.println(1);
                            System.exit(0);
                        } else {
                            board[r + dr[dir]][c + dc[dir]] = '.';
                        }
                    }
                }
            }
        }
    }
}