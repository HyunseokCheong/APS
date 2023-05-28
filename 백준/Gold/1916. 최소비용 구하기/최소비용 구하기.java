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
    static int N; // 도시의 개수 1 <= N <= 1000
    static int M; // 버스의 개수 1 <= M <= 100000
    static int start, end, cost; // 0 <= cost <= 100000
    static int targetStart, targetEnd;
    static ArrayList<ArrayList<Node>> graph;
    static PriorityQueue<Node> queue;
    static int[] dist;
    static Node curNode, nextNode;
    
    static class Node {
        
        int idx, cost;
        
        public Node(int idx, int cost) {
            this.idx = idx;
            this.cost = cost;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        
        graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<Node>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());
            graph.get(start).add(new Node(end, cost));
        }
        
        // solve
        dist = new int[N + 1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        
        st = new StringTokenizer(br.readLine());
        targetStart = Integer.parseInt(st.nextToken());
        targetEnd = Integer.parseInt(st.nextToken());
        
        queue = new PriorityQueue<Node>(((o1, o2) -> Integer.compare(o1.cost, o2.cost)));
        queue.add(new Node(targetStart, 0));
        dist[targetStart] = 0;
        
        while (!queue.isEmpty()) {
            curNode = queue.poll();
            if (dist[curNode.idx] < curNode.cost) {
                continue;
            }
            for (int i = 0; i < graph.get(curNode.idx).size(); i++) {
                nextNode = graph.get(curNode.idx).get(i);
                if (dist[nextNode.idx] > curNode.cost + nextNode.cost) {
                    dist[nextNode.idx] = curNode.cost + nextNode.cost;
                    queue.add(new Node(nextNode.idx, dist[nextNode.idx]));
                }
            }
        }
        
        // write
        bw.write(dist[targetEnd] + "");
        bw.flush();
        bw.close();
    }
}