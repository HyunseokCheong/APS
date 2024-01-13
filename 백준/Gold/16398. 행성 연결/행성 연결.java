import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] parent;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Edge> edges = new PriorityQueue<Edge>((e1, e2) -> e1.w - e2.w);
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int w = Integer.parseInt(st.nextToken());
                if (i == j) {
                    continue;
                }
                edges.add(new Edge(i, j, w));
            }
        }
        parent = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            parent[i] = i;
        }
        
        long result = 0;
        while (!edges.isEmpty()) {
            Edge edge = edges.poll();
            
            if (find(edge.v1) != find(edge.v2)) {
                union(edge.v1, edge.v2);
                result += edge.w;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
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
    
    static class Edge {
        
        int v1;
        int v2;
        int w;
        
        public Edge(int v1, int v2, int w) {
            this.v1 = v1;
            this.v2 = v2;
            this.w = w;
        }
    }
}