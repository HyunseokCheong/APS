import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    
    static class Point {
        int id;
        int score;
        int count;
        int time;
        
        public Point(int id, int score, int count, int time) {
            this.id = id;
            this.score = score;
            this.count = count;
            this.time = time;
        }
    }
    
    static PriorityQueue<Point> points = new PriorityQueue<>((p1, p2) -> {
        if (p1.score == p2.score) {
            if (p1.count == p2.count) {
                return p1.time - p2.time;
            }
            return p1.count - p2.count;
        }
        return p2.score - p1.score;
    });
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            points.add(new Point(i + 1, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        bw.write(points.poll().id + "\n");
        bw.flush();
        bw.close();
    }
}