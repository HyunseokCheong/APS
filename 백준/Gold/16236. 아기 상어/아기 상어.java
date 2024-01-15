import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static final int[][] DIR = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    
    static int n, size, time;
    static int[][] board;
    static List<Node> targetFishes;
    static Queue<Node> nodeQueue;
    
    static class Node {
        
        int r;
        int c;
        int d;
        
        public Node(int r, int c, int d) {
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        nodeQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 9) {
                    nodeQueue.add(new Node(i, j, 0));
                    board[i][j] = 0;
                }
            }
        }
    }
    
    static void process() throws IOException {
        time = 0;
        size = 2;
        
        int eat = 0;
        while (true) {
            targetFishes = getTargetFishes();
            if (targetFishes.isEmpty()) {
                return;
            }
            targetFishes.sort(new Comparator<Node>() {
                @Override
                public int compare(Node a, Node b) {
                    if (a.d == b.d) {
                        if (a.r == b.r) {
                            return a.c - b.c;
                        }
                        return a.r - b.r;
                    }
                    return a.d - b.d;
                    
                }
            });
            Node fish = targetFishes.get(0);
            time += fish.d;
            eat++;
            board[fish.r][fish.c] = 0;
            if (eat == size) {
                size++;
                eat = 0;
            }
            nodeQueue.add(new Node(fish.r, fish.c, 0));
        }
    }
    
    static List<Node> getTargetFishes() {
        List<Node> targetFishes = new ArrayList<>();
        int[][] dist = new int[n][n];
        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();
            for (int i = 0; i < 4; i++) {
                int nr = node.r + DIR[i][0];
                int nc = node.c + DIR[i][1];
                if (nr < 0 || nr >= n || nc < 0 || nc >= n) {
                    continue;
                }
                if (dist[nr][nc] != 0) {
                    continue;
                }
                if (size < board[nr][nc]) {
                    continue;
                }
                
                dist[nr][nc] = dist[node.r][node.c] + 1;
                nodeQueue.add(new Node(nr, nc, dist[nr][nc]));
                
                if (board[nr][nc] > 0 && board[nr][nc] < size) {
                    targetFishes.add(new Node(nr, nc, dist[nr][nc]));
                }
            }
        }
        return targetFishes;
    }
    
    static void output() throws IOException {
        bw.write(time + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}