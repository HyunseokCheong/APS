/**
 * 다익스트라 : 한 노드에서 모든 노드로 가는 최단거리를 구한다.
 * 최단거리를 저장하는 배열 + 우선순위 큐를 이용하여 구현한다.
 * 정점의 개수 V (1 <= V <= 20,000)
 * 간선의 개수 E (1 <= E <= 300,000)
 * 모든 정점에는 1부터 V까지 번호가 매겨져 있다.
 * 시작 정점 번호 K (1 <= K <= V)
 * u에서 v로 가는 가중치 w (u, v, w)
 *
 * @Author HyunseokCheong
 * @Date 2023/01/28
 */

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
    static int V, E, K;
    static int u, v, w;
    static ArrayList<ArrayList<Node>> graph;
    static int[] dist;
    static PriorityQueue<Node> queue;
    
    static class Node {
        
        int idx, weight;
        
        public Node(int idx, int weight) {
            this.idx = idx;
            this.weight = weight;
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        
        // 2차원 그래프
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
        
        // dist 배열을 MAX로 초기화
        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        // 우선순위 큐 선언
        // K와 K -> K의 가중치 0 입력
        // K까지 최단경로 0
        queue = new PriorityQueue<Node>((o1, o2) -> Integer.compare(o1.weight, o2.weight));
        queue.offer(new Node(K, 0));
        dist[K] = 0;
        
        // 탐색 시작
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            if (dist[curNode.idx] < curNode.weight) {
                continue;
            }
            
            for (int i = 0; i < graph.get(curNode.idx).size(); i++) {
                Node nextNode = graph.get(curNode.idx).get(i);
                if (dist[nextNode.idx] > curNode.weight + nextNode.weight) {
                    dist[nextNode.idx] = curNode.weight + nextNode.weight;
                    queue.add(new Node(nextNode.idx, dist[nextNode.idx]));
                }
            }
        }
        
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