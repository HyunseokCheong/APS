import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int v, e, k;
    static List<Node>[] graph;
    static int[] dist;
    
    static class Node {
        
        int index;
        int weight;
        
        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
    }
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());
        
        graph = new List[v + 1];
        for (int i = 1; i < v + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            graph[start].add(new Node(end, weight));
        }
    }
    
    static void process() throws IOException {
        PriorityQueue<Node> nodes = new PriorityQueue<>((n1, n2) -> n1.weight - n2.weight);
        dist = new int[v + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        nodes.add(new Node(k, 0));
        dist[k] = 0;
        
        while (!nodes.isEmpty()) {
            Node node = nodes.poll();
            
            for (Node nextNode : graph[node.index]) {
                int nextWeight = node.weight + nextNode.weight;
                
                if (dist[nextNode.index] <= nextWeight) {
                    continue;
                }
                
                nodes.add(new Node(nextNode.index, nextWeight));
                dist[nextNode.index] = nextWeight;
            }
        }
    }
    
    static void output() throws IOException {
        for (int i = 1; i < v + 1; i++) {
            bw.write((dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}