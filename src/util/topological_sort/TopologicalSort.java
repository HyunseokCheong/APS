package util.topological_sort;

import java.io.*;
import java.util.*;

/**
 * 유방향 비순환 그래프에서 위상 정렬을 수행할 수 있다.
 * 1. 진입 차수가 0인 노드를 큐에 삽입하고,
 * 2. 큐에서 노드를 하나씩 꺼내며 해당 노드와 연결된 노드의 진입 차수를 1씩 감소시킨다.
 * 3. 진입 차수가 0이 된 노드를 큐에 삽입하고, 큐가 빌 때까지 반복한다.
 * 진입차수: 한 노드로 들어오는 간선의 수
 */
public class TopologicalSort {
    
    // N: 노드의 총 수
    private static final int N = 5;
    private static int[] inDegree = new int[N + 1];
    private static List<List<Integer>> graph = new ArrayList<>();
    private static Queue<Integer> queue = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        initializeGraph(); // 그래프 초기화
        initializeInDegrees(); // 진입 차수 초기화
        performTopologicalSort(); // 위상 정렬 실행
    }
    
    /**
     * 위상 정렬을 수행하는 메서드
     */
    private static void performTopologicalSort() throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 초기 진입 차수가 0인 노드를 큐에 삽입
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        // 큐가 빌 때까지 노드를 하나씩 꺼내며 위상 정렬 수행
        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            writer.write(currentNode + " ");
            
            for (int nextNode : graph.get(currentNode)) {
                if (--inDegree[nextNode] == 0) {
                    queue.offer(nextNode);
                }
            }
        }
        
        writer.flush();
        writer.close();
    }
    
    /**
     * 그래프 초기화 메서드
     */
    private static void initializeGraph() {
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        
        addEdge(1, 2);
        addEdge(1, 4);
        addEdge(2, 5);
        addEdge(3, 5);
        addEdge(4, 2);
    }
    
    /**
     * 그래프에 간선을 추가하는 헬퍼 메서드
     */
    private static void addEdge(int from, int to) {
        graph.get(from).add(to);
    }
    
    /**
     * 각 노드의 진입 차수를 초기화하는 메서드
     */
    private static void initializeInDegrees() {
        inDegree[2] = 2;
        inDegree[4] = 1;
        inDegree[5] = 2;
    }
}
