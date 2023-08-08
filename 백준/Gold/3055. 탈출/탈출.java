import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int r;
    static int c;
    static char[][] board;
    static Queue<Location> waterQueue;
    static Queue<Location> hedgehogQueue;
    static boolean[][] waterVisited;
    static boolean[][] hedgehogVisited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static Location goal;
    
    static class Location {
        int row;
        int col;
        int count;
        
        Location(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static void input() throws IOException {
        stk();
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        waterQueue = new LinkedList<>();
        hedgehogQueue = new LinkedList<>();
        waterVisited = new boolean[r][c];
        hedgehogVisited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < c; j++) {
                char cur = input[j];
                Location curLoc = new Location(i, j);
                board[i][j] = cur;
                
                if (cur == 'D') {
                    goal = curLoc;
                    continue;
                }
                
                if (cur == 'S') {
                    curLoc.count = 0;
                    hedgehogQueue.add(curLoc);
                    hedgehogVisited[i][j] = true;
                }
                
                if (cur == '*') {
                    waterQueue.add(curLoc);
                    waterVisited[i][j] = true;
                }
            }
        }
    }
    
    static void solve() throws IOException {
        int answer = Integer.MAX_VALUE;
        int row, col, count, nextRow, nextCol, nextCount;
        while (!hedgehogQueue.isEmpty()) {
            // water
            int waterQueueLength = waterQueue.size();
            for (int i = 0; i < waterQueueLength; i++) {
                Location curWater = waterQueue.poll();
                row = curWater.row;
                col = curWater.col;
                for (int d = 0; d < 4; d++) {
                    nextRow = row + dr[d];
                    nextCol = col + dc[d];
                    
                    if (nextRow < 0 || nextRow >= r) {
                        continue;
                    }
                    if (nextCol < 0 || nextCol >= c) {
                        continue;
                    }
                    if (board[nextRow][nextCol] == '*') {
                        continue;
                    }
                    if (board[nextRow][nextCol] == 'X') {
                        continue;
                    }
                    if (board[nextRow][nextCol] == 'D') {
                        continue;
                    }
                    if (waterVisited[nextRow][nextCol]) {
                        continue;
                    }
                    
                    board[nextRow][nextCol] = '*';
                    waterQueue.add(new Location(nextRow, nextCol));
                    waterVisited[nextRow][nextCol] = true;
                }
            }
            
            // hedgehog
            int hedgehogQueueLength = hedgehogQueue.size();
            for (int i = 0; i < hedgehogQueueLength; i++) {
                Location curHedgeHog = hedgehogQueue.poll();
                
                row = curHedgeHog.row;
                col = curHedgeHog.col;
                count = curHedgeHog.count;
                
                if (row == goal.row && col == goal.col) {
                    answer = Math.min(answer, count);
                    continue;
                }
                
                for (int d = 0; d < 4; d++) {
                    nextRow = row + dr[d];
                    nextCol = col + dc[d];
                    
                    if (nextRow < 0 || nextRow >= r) {
                        continue;
                    }
                    if (nextCol < 0 || nextCol >= c) {
                        continue;
                    }
                    if (board[nextRow][nextCol] == '*') {
                        continue;
                    }
                    if (board[nextRow][nextCol] == 'X') {
                        continue;
                    }
                    if (hedgehogVisited[nextRow][nextCol]) {
                        continue;
                    }
                    Location location = new Location(nextRow, nextCol);
                    nextCount = count + 1;
                    location.count = nextCount;
                    hedgehogQueue.add(location);
                    hedgehogVisited[nextRow][nextCol] = true;
                }
            }
        }
        if (answer == Integer.MAX_VALUE) {
            bw.write("KAKTUS" + "\n");
        } else {
            bw.write(answer + "\n");
        }
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}