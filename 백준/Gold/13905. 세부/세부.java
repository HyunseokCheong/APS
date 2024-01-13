import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] parent;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        PriorityQueue<Edge> edges = new PriorityQueue<>((e1, e2) -> e2.weight - e1.weight);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges.add(new Edge(vertex1, vertex2, weight));
        }
        parent = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }
        
        int minWeight = 0;
        while (!edges.isEmpty()) {
            Edge edge = edges.poll();
            if (find(edge.vertex1) != find(edge.vertex2)) {
                union(edge.vertex1, edge.vertex2);
                
                if (find(s) == find(e)) {
                    minWeight = edge.weight;
                    break;
                }
            }
        }
        bw.write(minWeight + "\n");
        bw.flush();
        bw.close();
    }
    
    static int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    static void union(int x, int y) {
        int xParent = find(x);
        int yParent = find(y);
        
        if (xParent < yParent) {
            parent[yParent] = xParent;
        } else if (xParent > yParent) {
            parent[xParent] = yParent;
        }
    }
    
    static class Edge {
        
        int vertex1;
        int vertex2;
        int weight;
        
        public Edge(int vertex1, int vertex2, int weight) {
            this.vertex1 = vertex1;
            this.vertex2 = vertex2;
            this.weight = weight;
        }
    }
}