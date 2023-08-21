package strick;

import java.io.*;
import java.util.*;

public class BOJ_1005 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int testCase;
    static int N, K;
    static int[] D;
    static int W;
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            D = new int[N + 1];
            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                D[i] = Integer.parseInt(st.nextToken());
            }
            
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < N + 1; i++) {
                graph.add(new ArrayList<>());
            }
            int[] inDegree = new int[N + 1];
            
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                
                graph.get(S).add(E);
                inDegree[E]++;
            }
            W = Integer.parseInt(br.readLine());
            
            topologicalSort(inDegree, graph, W);
        }
    }
    
    static void topologicalSort(int[] inDegree, ArrayList<ArrayList<Integer>> graph, int w) {
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            result[i] = D[i];
            
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Integer next : graph.get(node)) {
                result[next] = Math.max(result[next], result[node] + D[next]);
                inDegree[next]--;
                
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        
        System.out.println(result[W]);
    }
}
