import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, a, b, c, m, f, t, d;
    static ArrayList<Edge>[] g;
    static PriorityQueue<Edge> edges;
    
    static class Edge {
        int to, dist;
        
        public Edge(int to, int dist) {
            this.to = to;
            this.dist = dist;
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        g = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            g[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            f = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            g[f].add(new Edge(t, d));
            g[t].add(new Edge(f, d));
        }
    }
    
    static void process() throws IOException {
        long[] dist1 = dijkstra(a);
        long[] dist2 = dijkstra(b);
        long[] dist3 = dijkstra(c);
        int result = 0;
        long compare = 0;
        for (int i = 1; i < n + 1; i++) {
            long minDist = Math.min(dist1[i], Math.min(dist2[i], dist3[i]));
            if (minDist == compare) {
                continue;
            }
            if (minDist > compare) {
                compare = minDist;
                result = i;
            }
        }
        bw.write(result + "\n");
    }
    
    static long[] dijkstra(int start) {
        long[] dist = new long[n + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[start] = 0;
        edges = new PriorityQueue<>((o1, o2) -> o1.dist - o2.dist);
        edges.add(new Edge(start, 0));
        while (!edges.isEmpty()) {
            Edge edge = edges.poll();
            int curPos = edge.to;
            int curDist = edge.dist;

            for (int i = 0; i < g[curPos].size(); i++) {
                int nextDist = curDist + g[curPos].get(i).dist;
                int nextPos = g[curPos].get(i).to;
                if (dist[nextPos] > nextDist) {
                    dist[nextPos] = nextDist;
                    edges.add(new Edge(nextPos, nextDist));
                }
            }
        }
        return dist;
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