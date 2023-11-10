import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b, n, m;
    static int[] dist;
    static Queue<Integer> queue;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dist = new int[100001];
        Arrays.fill(dist, Integer.MAX_VALUE);
    }
    
    static void process() throws IOException {
        queue = new LinkedList<>();
        queue.add(n);
        dist[n] = 0;
        
        int cur, next;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            
            if (cur == m) {
                bw.write(dist[m] + "\n");
                return;
            }
            
            next = cur + 1;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur - 1;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur + a;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur - a;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur + b;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur - b;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur * a;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
            next = cur * b;
            if (isOk(next, cur)) {
                queue.add(next);
                dist[next] = dist[cur] + 1;
            }
        }
    }
    
    static boolean isOk(int next, int cur) {
        return next >= 0 && next <= 100000 && dist[next] > dist[cur] + 1;
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