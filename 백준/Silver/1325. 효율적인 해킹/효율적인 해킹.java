import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int M;
    static List<Integer>[] list;
    static int A;
    static int B;
    static Queue<Integer> queue;
    static boolean[] visited;
    static int max;
    static int[] result;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        list = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            list[A].add(B);
        }
        
        queue = new LinkedList<>();
        result = new int[N + 1];
        max = 0;
        for (int i = 1; i <= N; i++) {
            BFS(i);
        }
        
        for (int i = 1; i <= N; i++) {
            if (result[i] == max) {
                bw.write(i + " ");
            }
        }
        bw.flush();
        bw.close();
    }
    
    static void BFS(int start) {
        visited = new boolean[N + 1];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int c : list[current]) {
                if (!visited[c]) {
                    queue.add(c);
                    visited[c] = true;
                    result[c]++;
                    max = Math.max(max, result[c]);
                }
            }
        }
    }
}