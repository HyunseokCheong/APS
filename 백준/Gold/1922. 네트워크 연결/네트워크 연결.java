import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] parent;
    
    static int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX < rootY) {
            parent[rootY] = rootX;
        } else if (rootX > rootY) {
            parent[rootX] = rootY;
        }
    }
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        PriorityQueue<Edge> edges = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            edges.add(new Edge(vertex1, vertex2, weight));
        }
        
        parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }
        
        int result = 0;
        while (!edges.isEmpty()) {
            Edge edge = edges.poll();
            if (find(edge.vertex1) != find(edge.vertex2)) {
                union(edge.vertex1, edge.vertex2);
                result += edge.weight;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
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