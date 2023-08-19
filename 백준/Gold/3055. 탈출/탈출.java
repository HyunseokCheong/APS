import java.io.*;
import java.util.*;

public class Main {
    
    static final int[] DX = {-1, 1, 0, 0};
    static final int[] DY = {0, 0, -1, 1};
    static final char WATER = '*';
    static final char STONE = 'X';
    static final char GOAL = 'D';
    static final char HEDGEHOG = 'S';
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int rows, cols;
    static char[][] board;
    static Queue<Location> waterQueue = new LinkedList<>();
    static Queue<Location> hedgehogQueue = new LinkedList<>();
    static boolean[][] waterVisited, hedgehogVisited;
    static Location endLocation;
    
    static class Location {
        int x, y, steps;
        
        Location(int x, int y) {
            this(x, y, 0);
        }
        
        Location(int x, int y, int steps) {
            this.x = x;
            this.y = y;
            this.steps = steps;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        rows = Integer.parseInt(st.nextToken());
        cols = Integer.parseInt(st.nextToken());
        
        board = new char[rows][cols];
        waterVisited = new boolean[rows][cols];
        hedgehogVisited = new boolean[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            String line = br.readLine();
            for (int j = 0; j < cols; j++) {
                char currentChar = line.charAt(j);
                board[i][j] = currentChar;
                
                switch (currentChar) {
                    case GOAL:
                        endLocation = new Location(i, j);
                        break;
                    case HEDGEHOG:
                        hedgehogQueue.add(new Location(i, j));
                        hedgehogVisited[i][j] = true;
                        break;
                    case WATER:
                        waterQueue.add(new Location(i, j));
                        waterVisited[i][j] = true;
                        break;
                }
            }
        }
    }
    
    static boolean isWithinBounds(int x, int y) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
    
    static void updateWaterLocations() {
        int waterSize = waterQueue.size();
        for (int i = 0; i < waterSize; i++) {
            Location current = waterQueue.poll();
            
            for (int dir = 0; dir < 4; dir++) {
                int nextX = current.x + DX[dir];
                int nextY = current.y + DY[dir];
                
                if (isWithinBounds(nextX, nextY) && board[nextX][nextY] != WATER
                        && board[nextX][nextY] != STONE && board[nextX][nextY] != GOAL
                        && !waterVisited[nextX][nextY]) {
                    board[nextX][nextY] = WATER;
                    waterVisited[nextX][nextY] = true;
                    waterQueue.add(new Location(nextX, nextY));
                }
            }
        }
    }
    
    static int findHedgehogPath() {
        while (!hedgehogQueue.isEmpty()) {
            updateWaterLocations();
            
            int hedgehogSize = hedgehogQueue.size();
            for (int i = 0; i < hedgehogSize; i++) {
                Location current = hedgehogQueue.poll();
                
                if (current.x == endLocation.x && current.y == endLocation.y) {
                    return current.steps;
                }
                
                for (int dir = 0; dir < 4; dir++) {
                    int nextX = current.x + DX[dir];
                    int nextY = current.y + DY[dir];
                    
                    if (isWithinBounds(nextX, nextY) && board[nextX][nextY] != WATER
                            && board[nextX][nextY] != STONE && !hedgehogVisited[nextX][nextY]) {
                        hedgehogVisited[nextX][nextY] = true;
                        hedgehogQueue.add(new Location(nextX, nextY, current.steps + 1));
                    }
                }
            }
        }
        return -1;
    }
    
    static void solve() throws IOException {
        int result = findHedgehogPath();
        bw.write(result == -1 ? "KAKTUS" : Integer.toString(result));
        bw.newLine();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
}