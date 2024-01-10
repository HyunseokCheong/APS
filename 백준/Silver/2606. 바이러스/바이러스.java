import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, count;
    static int[][] board;
    static boolean[] visited;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        board = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            board[a][b] = 1;
            board[b][a] = 1;
        }
    }
    
    static void recur(int i) {
        visited[i] = true;
        for (int j = 1; j < n + 1; j++) {
            if (board[i][j] != 1 || visited[j]) {
                continue;
            }
            count++;
            recur(j);
        }
    }
    
    static void process() throws IOException {
        count = 0;
        visited = new boolean[n + 1];
        recur(1);
        bw.write(count + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}