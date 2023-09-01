import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int r, c, t;
    static char[][] board;
    
    static int maxCount;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static Dog dog;
    
    static class Dog {
        int row;
        int col;
        int time;
        int count;
        
        public Dog(int row, int col, int time, int count) {
            this.row = row;
            this.col = col;
            this.time = time;
            this.count = count;
        }
    }
    
    static void process() {
        maxCount = 0;
        visited = new boolean[r][c];
        DFS(dog);
    }
    
    static void DFS(Dog dog) {
        if (dog.time == t) {
            maxCount = Math.max(maxCount, dog.count);
            return;
        }
        
        visited[dog.row][dog.col] = true;
        for (int i = 0; i < 4; i++) {
            int nextRow = dog.row + dr[i];
            int nextCol = dog.col + dc[i];
            
            if (!isOk(nextRow, nextCol)) {
                continue;
            }
            
            if (visited[nextRow][nextCol]) {
                DFS(new Dog(nextRow, nextCol, dog.time + 1, dog.count));
                continue;
            }
            
            if (board[nextRow][nextCol] == 'S') {
                DFS(new Dog(nextRow, nextCol, dog.time + 1, dog.count + 1));
                visited[nextRow][nextCol] = false;
                continue;
            }
            DFS(new Dog(nextRow, nextCol, dog.time + 1, dog.count));
        }
    }
    
    static boolean isOk(int row, int col) {
        return row >= 0 && row < r && col >= 0 && col < c && board[row][col] != '#';
    }
    
    static void output() throws IOException {
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        board = new char[r][c];
        boolean found = false;
        for (int i = 0; i < r; i++) {
            board[i] = br.readLine().toCharArray();
            for (int j = 0; j < c && !found; j++) {
                if (board[i][j] == 'G') {
                    dog = new Dog(i, j, 0, 0);
                    found = true;
                    break;
                }
            }
        }
        br.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}