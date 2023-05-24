import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int V, E;
    static int K;
    static int u, v, w;
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    static PriorityQueue<Node> queue;
    static Node curNode, nextNode;
    
    static class Node {
        
        int index;
        int weight;
        
        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<Node>());
        }
        
        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            u = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }
        
        // solve
        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        queue = new PriorityQueue<Node>(((o1, o2) -> Integer.compare(o1.weight, o2.weight)));
        queue.add(new Node(K, 0));
        dist[K] = 0;
    
        while (!queue.isEmpty()) {
            curNode = queue.poll();
            if (dist[curNode.index] < curNode.weight) {
                continue;
            }
            for (int i = 0; i < graph.get(curNode.index).size(); i++) {
                nextNode = graph.get(curNode.index).get(i);
                if (dist[nextNode.index] > curNode.weight + nextNode.weight) {
                    dist[nextNode.index] = curNode.weight + nextNode.weight;
                    queue.add(new Node(nextNode.index, dist[nextNode.index]));
                }
            }
        }
        
        // write
        for (int i = 1; i < V + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                bw.write("INF" + "\n");
            } else {
                bw.write(dist[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}