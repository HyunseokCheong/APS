import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, result;
    static List<Edge>[] tree;
    static boolean[] visited;
    static PriorityQueue<Edge> edges;
    
    static class Edge {
        
        int vertex;
        int weight;
        
        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        tree = new List[n + 1];
        for (int i = 1; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int vertex1 = Integer.parseInt(st.nextToken());
            int vertex2 = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            tree[vertex1].add(new Edge(vertex2, weight));
            tree[vertex2].add(new Edge(vertex1, weight));
        }
    }
    
    static void process() throws IOException {
        result = 0;
        edges = new PriorityQueue<>((e1, e2) -> e1.weight - e2.weight);
        visited = new boolean[n + 1];
        
        edges.addAll(tree[1]);
        visited[1] = true;
        
        while (!edges.isEmpty()) {
            Edge curEdge = edges.poll();
            if (visited[curEdge.vertex]) {
                continue;
            }
            visited[curEdge.vertex] = true;
            result += curEdge.weight;
            
            edges.addAll(tree[curEdge.vertex]);
        }
    }
    
    static void output() throws IOException {
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}