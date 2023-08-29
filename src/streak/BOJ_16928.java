package streak;

import java.io.*;
import java.util.*;

public class BOJ_16928 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] board;
    static int[] dist;
    static int n, m;
    static Queue<Point> queue;
    
    static class Point {
        int x, v;
        
        Point(int x, int v) {
            this.x = x;
            this.v = v;
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[101];
        for (int i = 0; i < n + m; i++) {
            st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
        }
        
        dist = new int[101];
        Arrays.fill(dist, Integer.MAX_VALUE);
        queue = new LinkedList<>();
        queue.add(new Point(1, 0));
        dist[1] = 0;
        
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int curX = cur.x;
            int curV = cur.v;
            
            for (int i = 1; i <= 6; i++) {
                int nextX = curX + i;
                int nextV = curV + 1;
                
                if (nextX > 100) {
                    continue;
                }
                
                nextX = board[nextX] == 0 ? nextX : board[nextX];
                
                if (nextV >= dist[nextX]) {
                    continue;
                }
                
                queue.add(new Point(nextX, nextV));
                dist[nextX] = nextV;
            }
        }
        
        bw.write(dist[100] + "\n");
        bw.flush();
        bw.close();
    }
}
