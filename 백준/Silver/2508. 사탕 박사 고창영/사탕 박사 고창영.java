/**
 * 사탕 시작점 찾고 사탕이 이루어 지는지 체크
 * . o < > v ^
 *
 * @Author HyunseokCheong
 * @Date 2023-01-17
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
    static int T;
    static int R, C;
    static char[][] field;
    static String input;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    static int curR, curC, nextR, nextC, nextNextR, nextNextC, dir;
    static int count;
    
    public static void main(String[] args) throws IOException {
        // read
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String temp = br.readLine();
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            field = new char[R][C];
            for (int i = 0; i < R; i++) {
                input = br.readLine();
                for (int j = 0; j < C; j++) {
                    field[i][j] = input.charAt(j);
                }
            }
            
            // solve
            count = 0;
            for (int r = 0; r < R; r++) {
                for (int c = 0; c < C; c++) {
                    curR = r;
                    curC = c;
                    if (field[r][c] == 'v') {
                        dir = 1;
                        nextR = curR + dr[dir];
                        nextNextR = nextR + dr[dir];
                        nextC = curC + dc[dir];
                        nextNextC = nextC + dc[dir];
                        
                        if (nextR < 0 || nextR >= R || nextC < 0 || nextC >= C || nextNextR < 0 || nextNextR >= R
                                || nextNextC < 0 || nextNextC >= C) {
                            continue;
                        }
                        if (field[nextR][nextC] == 'o' && field[nextNextR][nextNextC] == '^') {
                            count++;
                        }
                    }
                    if (field[r][c] == '>') {
                        dir = 3;
                        nextR = curR + dr[dir];
                        nextNextR = nextR + dr[dir];
                        nextC = curC + dc[dir];
                        nextNextC = nextC + dc[dir];
                        if (nextR < 0 || nextR >= R || nextC < 0 || nextC >= C || nextNextR < 0 || nextNextR >= R
                                || nextNextC < 0 || nextNextC >= C) {
                            continue;
                        }
                        if (field[nextR][nextC] == 'o' && field[nextNextR][nextNextC] == '<') {
                            count++;
                        }
                    }
                }
            }
            bw.write(count + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}