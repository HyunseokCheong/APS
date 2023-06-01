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
    static int N, M, K;
    static int U, V;
    static ArrayList<ArrayList<Node>> graph;
    static long[] dist;
    static PriorityQueue<Node> queue;
    static Node curNode, nextNode;
    static int  maxValIdx;
    
    static long C, maxVal;
    static class Node {
        
        int index;
        long weight;
        
        public Node(int index, long weight) {
            this.index = index;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<Node>());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            U = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            C = Long.parseLong(st.nextToken());
            graph.get(V).add(new Node(U, C));
        }
        
        // solve
        dist = new long[N + 1];
        Arrays.fill(dist, Long.MAX_VALUE);
        queue = new PriorityQueue<Node>((o1, o2) -> Long.compare(o1.weight, o2.weight));
        
        st = new StringTokenizer(br.readLine());
        for (int k = 0; k < K; k++) {
            int X = Integer.parseInt(st.nextToken());
            queue.add(new Node(X, 0));
            dist[X] = 0;
        }
        
        while (!queue.isEmpty()) {
            curNode = queue.poll();
            if (dist[curNode.index] < curNode.weight) {
                continue;
            }
            for (int j = 0; j < graph.get(curNode.index).size(); j++) {
                nextNode = graph.get(curNode.index).get(j);
                if (dist[nextNode.index] > curNode.weight + nextNode.weight) {
                    dist[nextNode.index] = curNode.weight + nextNode.weight;
                    queue.add(new Node(nextNode.index, dist[nextNode.index]));
                }
            }
        }
        
        // write
        maxVal = 0;
        maxValIdx = 0;
        for (int i = 1; i < N + 1; i++) {
            if (maxVal < dist[i]) {
                maxVal = dist[i];
                maxValIdx = i;
            }
        }
        bw.write(maxValIdx + "\n" + maxVal + "");
        bw.flush();
        bw.close();
    }
}