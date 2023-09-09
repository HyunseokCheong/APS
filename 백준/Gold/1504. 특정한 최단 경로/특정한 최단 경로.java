import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, e;
    static List<List<Node>> graph;
    static int[] dist;
    static boolean[] visited;
    static PriorityQueue<Node> pq;
    static final int INF = 200_000_000;
    
    static class Node {
        int end, cost;
        
        public Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        dist = new int[n + 1];
        visited = new boolean[n + 1];
        
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(start).add(new Node(end, cost));
            graph.get(end).add(new Node(start, cost));
        }
        
        st = new StringTokenizer(br.readLine());
        int target1 = Integer.parseInt(st.nextToken());
        int target2 = Integer.parseInt(st.nextToken());
        
        int res1 = 0;
        res1 += dijkstra(1, target1);
        res1 += dijkstra(target1, target2);
        res1 += dijkstra(target2, n);
        
        int res2 = 0;
        res2 += dijkstra(1, target2);
        res2 += dijkstra(target2, target1);
        res2 += dijkstra(target1, n);
        
        int res = (res1 >= INF && res2 >= INF) ? -1 : Math.min(res1, res2);
        
        bw.write(res + "\n");
        bw.flush();
        bw.close();
    }
    
    static int dijkstra(int start, int end) {
        Arrays.fill(dist, INF);
        Arrays.fill(visited, false);
        pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            int cur = node.end;
            
            if (!visited[cur]) {
                visited[cur] = true;
                
                for (Node next : graph.get(cur)) {
                    if (!visited[next.end] && dist[next.end] > dist[cur] + next.cost) {
                        dist[next.end] = dist[cur] + next.cost;
                        pq.add(new Node(next.end, dist[next.end]));
                    }
                }
            }
        }
        
        return dist[end];
    }
}