import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N; // 마을의 개수 (1 <= N <= 1000)
    static int M; // 도로의 개수 (1 <= M <= 10000)
    static int X; // 모이는 마을 (1 <= X <= N)
    static int start, end, time; // 1 <= time <= 100
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist, distToX, distFromX;
    static PriorityQueue<Node> queue;
    static Node curNode, nextNode;
    static int maxVal;
    
    static class Node {
        
        int index, time;
        
        public Node(int index, int time) {
            this.index = index;
            this.time = time;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<Node>());
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            time = Integer.parseInt(st.nextToken());
            graph.get(start).add(new Node(end, time));
        }
        
        // solve
        dist = new int[N + 1];
        distToX = new int[N + 1];
        Arrays.fill(distToX, Integer.MAX_VALUE);
        distFromX = new int[N + 1];
        queue = new PriorityQueue<Node>((((o1, o2) -> Integer.compare(o1.time, o2.time))));
        
        // To X
        for (int i = 1; i < N + 1; i++) {
            Arrays.fill(dist, Integer.MAX_VALUE);
            queue.add(new Node(i, 0));
            dist[i] = 0;
            
            while (!queue.isEmpty()) {
                curNode = queue.poll();
                if (dist[curNode.index] < curNode.time) {
                    continue;
                }
                for (int j = 0; j < graph.get(curNode.index).size(); j++) {
                    nextNode = graph.get(curNode.index).get(j);
                    if (dist[nextNode.index] > curNode.time + nextNode.time) {
                        dist[nextNode.index] = curNode.time + nextNode.time;
                        queue.add(new Node(nextNode.index, dist[nextNode.index]));
                    }
                }
            }
            
            distToX[i] = dist[X];
        }
        
        // From X
        Arrays.fill(distFromX, Integer.MAX_VALUE);
        queue.add(new Node(X, 0));
        distFromX[X] = 0;
        while (!queue.isEmpty()) {
            curNode = queue.poll();
            if (distFromX[curNode.index] < curNode.time) {
                continue;
            }
            for (int i = 0; i < graph.get(curNode.index).size(); i++) {
                nextNode = graph.get(curNode.index).get(i);
                if (distFromX[nextNode.index] > curNode.time + nextNode.time) {
                    distFromX[nextNode.index] = curNode.time + nextNode.time;
                    queue.add(new Node(nextNode.index, distFromX[nextNode.index]));
                }
            }
        }
        
        // write
        maxVal = Integer.MIN_VALUE;
        for (int i = 1; i < N + 1; i++) {
            maxVal = Math.max(maxVal, distToX[i] + distFromX[i]);
        }
        bw.write(maxVal + "");
        bw.flush();
        bw.close();
    }
}