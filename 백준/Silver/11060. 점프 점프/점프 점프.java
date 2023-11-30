import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] board;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        board = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            board[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        boolean[] visited = new boolean[n];
        Queue<int[]> queue = new LinkedList<>(); // pos cnt
        
        int minCnt = Integer.MAX_VALUE;
        queue.add(new int[]{0, 0});
        visited[0] = true;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int curPos = cur[0];
            int curCnt = cur[1];
            
            if (curPos == n - 1) {
                minCnt = Math.min(minCnt, curCnt);
            }
            
            for (int i = 1; i < board[curPos] + 1; i++) {
                int nextPos = curPos + i;
                if (nextPos >= n) {
                    continue;
                }
                if (visited[nextPos]) {
                    continue;
                }
                queue.add(new int[]{nextPos, curCnt + 1});
                visited[nextPos] = true;
            }
        }
        bw.write((minCnt == Integer.MAX_VALUE ? -1 : minCnt) + "\n");
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