import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t, n;
    static Point[] points;
    static boolean[] visited;
    static Queue<Point> pointQueue;
    static final String OK = "happy\n", NO = "sad\n";
    
    static class Point {
        int idx, row, col;
        
        public Point(int idx) throws IOException {
            this.idx = idx;
            st = new StringTokenizer(br.readLine());
            this.row = Integer.parseInt(st.nextToken());
            this.col = Integer.parseInt(st.nextToken());
        }
        
        public boolean canGo(Point to) {
            return Math.abs(this.row - to.row) + Math.abs(this.col - to.col) <= 1000 && !visited[to.idx];
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        points = new Point[n + 2];
        for (int i = 0; i < n + 2; i++) {
            points[i] = new Point(i);
        }
    }
    
    static void process() throws IOException {
        visited = new boolean[n + 2];
        pointQueue = new LinkedList<>();
        
        pointQueue.add(points[0]);
        visited[0] = true;
        
        while (!pointQueue.isEmpty()) {
            Point from = pointQueue.poll();
            
            for (Point to : points) {
                if (from.canGo(to)) {
                    pointQueue.add(to);
                    visited[to.idx] = true;
                }
            }
        }
        
        bw.write(visited[n + 1] ? OK : NO);
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input();
            process();
        }
        output();
    }
}