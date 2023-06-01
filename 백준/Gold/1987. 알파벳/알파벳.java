/*
 * 그냥 BFS?
 * 'A' - 65 = 0
 * 'Z' - 65 = 25
 * arr = new int[26];
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int R, C; // 1 <= R, C <= 20
    static String input;
    static char[][] field;
    static boolean[] visited;
    static int nextR, nextC, maxVal;
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        // read
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
        maxVal = Integer.MIN_VALUE;
        visited = new boolean[26];
        
        dfs(0, 0, 0); // R, C, count
        
        // write
        bw.write(maxVal + "\n");
        bw.flush();
        bw.close();
    }
    
    static void dfs(int r, int c, int cnt) {
        if (visited[charToInt(field[r][c])]) {
            maxVal = Math.max(maxVal, cnt);
            return;
        } else {
            visited[charToInt(field[r][c])] = true;
            for (int i = 0; i < 4; i++) {
                nextR = r + dr[i];
                nextC = c + dc[i];
                
                if (nextR >= 0 && nextC >= 0 && nextR < R && nextC < C) {
                    dfs(nextR, nextC, cnt + 1);
                }
            }
            visited[charToInt(field[r][c])] = false;
        }
    }
    
    static int charToInt(char a) {
        return a - 65;
    }
}