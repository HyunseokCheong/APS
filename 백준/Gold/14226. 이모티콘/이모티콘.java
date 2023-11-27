import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int s;
    static boolean[][] visited;
    static Queue<Point> queue;
    
    static class Point {
        int d, c, t;
        
        public Point(int d, int c, int t) {
            this.d = d;
            this.c = c;
            this.t = t;
        }
    }
    
    static void input() throws IOException {
        s = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        visited = new boolean[1001][1001]; // d, c
        queue = new LinkedList<>();
        queue.offer(new Point(1, 0, 0));
        visited[1][0] = true;
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            if (cur.d == s) {
                bw.write(cur.t + "\n");
                return;
            }
            // 복사
            queue.offer(new Point(cur.d, cur.d, cur.t + 1));
            // 붙여넣기
            if (cur.c > 0 && cur.d + cur.c <= s && !visited[cur.d + cur.c][cur.c]) {
                queue.add(new Point(cur.d + cur.c, cur.c, cur.t + 1));
                visited[cur.d + cur.c][cur.c] = true;
            }
            // 삭제
            if (cur.d > 0 && !visited[cur.d - 1][cur.c]) {
                queue.add(new Point(cur.d - 1, cur.c, cur.t + 1));
                visited[cur.d - 1][cur.c] = true;
            }
        }
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