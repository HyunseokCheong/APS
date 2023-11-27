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
        int clipboard, total, time;
        
        public Point(int clipboard, int total, int time) {
            this.clipboard = clipboard;
            this.total = total;
            this.time = time;
        }
    }
    
    static void input() throws IOException {
        s = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        queue = new LinkedList<>();
        visited = new boolean[1001][1001]; // clipboard, total
        
        queue.offer(new Point(0, 1, 0));
        visited[0][1] = true;
        
        while (!queue.isEmpty()) {
            Point cur = queue.poll();
            int curClipboard = cur.clipboard;
            int curTotal = cur.total;
            int curTime = cur.time;
            
            if (curTotal == s) {
                bw.write(curTime + "\n");
                return;
            }
            // 1
            int nextClipboard = curTotal;
            int nextTotal = curTotal;
            int nextTime = curTime + 1;
            queue.offer(new Point(nextClipboard, nextTotal, nextTime));
            // 2
            if (cur.clipboard != 0 && cur.total + cur.clipboard <= s
                    && !visited[cur.clipboard][cur.total + cur.clipboard]) {
                nextClipboard = curClipboard;
                nextTotal = curTotal + curClipboard;
                queue.offer(new Point(nextClipboard, nextTotal, nextTime));
                visited[nextClipboard][nextTotal] = true;
            }
            // 3
            if (curTotal >= 1 && !visited[curClipboard][curTotal - 1]) {
                nextClipboard = curClipboard;
                nextTotal = curTotal - 1;
                queue.offer(new Point(nextClipboard, nextTotal, nextTime));
                visited[nextClipboard][nextTotal] = true;
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