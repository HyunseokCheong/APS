/**
 * 방문체크 하면서 DFS
 * 1 <= N <= 1000
 * 0 <= M <= N * (N - 1) / 2
 * 1 <= U, V <= N
 * U != V
 *
 * @Author HyunseokCheong
 * @Date 2023/01/28
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N, M;
    static int U, V;
    static int[][] graph = new int[1001][1001];
    static boolean[] visited = new boolean[1001];
    static int answer;
    
    static void DFS(int index) {
        if (visited[index]) {
            return;
        }
        visited[index] = true;
        for (int i = 1; i <= N; i++) {
            if (graph[index][i] == 1) {
                DFS(i);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            U = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());
            graph[U][V] = 1;
            graph[V][U] = 1;
        }
        
        // solve
        answer = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                DFS(i);
                answer++;
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}