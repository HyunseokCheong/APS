import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, L, R;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1}, dy = {-1, 1, 0, 0};
    static ArrayList<Node> list;
    static int result;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
    
    static void process() throws IOException {
        result = 0;
        while (true) {
            boolean flag = false;
            visited = new boolean[N][N];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (visited[i][j]) {
                        continue;
                    }
                    int sum = BFS(i, j);
                    if (list.size() > 1) {
                        move(sum);
                        flag = true;
                    }
                }
            }
            if (!flag) {
                break;
            }
            result++;
        }
    }
    
    static int BFS(int X, int Y) {
        Queue<Node> queue = new LinkedList<>();
        list = new ArrayList<>();
        queue.add(new Node(X, Y));
        list.add(new Node(X, Y));
        visited[X][Y] = true;
        
        int sum = board[X][Y];
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nextX = node.X + dx[i];
                int nextY = node.Y + dy[i];
                
                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= N) {
                    continue;
                }
                
                if (visited[nextX][nextY]) {
                    continue;
                }
                
                int diff = Math.abs(board[node.X][node.Y] - board[nextX][nextY]);
                if (diff < L || diff > R) {
                    continue;
                }
                queue.add(new Node(nextX, nextY));
                list.add(new Node(nextX, nextY));
                sum += board[nextX][nextY];
                visited[nextX][nextY] = true;
            }
        }
        return sum;
    }
    
    static void output() throws IOException {
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void move(int sum) {
        int average = sum / list.size();
        for (Node node : list) {
            board[node.X][node.Y] = average;
        }
    }
    
    static class Node {
        int X;
        int Y;
        
        public Node(int X, int y) {
            this.X = X;
            this.Y = y;
        }
    }
}