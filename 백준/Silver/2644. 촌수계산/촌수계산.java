import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    
    static int N, M, S, E;
    static int[][]   graph;
    static boolean[] visited;
    static int       answer;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        // 그래프, 방문 배열 초기화
        graph   = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        stk();
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        // 그래프에 촌수 작성: 1이면 친척관계
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            stk();
            int p = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph[p][c] = 1;
            graph[c][p] = 1;
        }
    }
    
    static void dfs(int now, int depth) {
        // 목적지에 도달했으면 종료
        if (now == E) {
            answer = depth;
            return;
        }
        
        // 방문 체크하고 탐색 시작
        visited[now] = true;
        // graph[now]에서 친척관계이면서 방문하지 않은 곳 탐색
        for (int next = 0; next <= N; next++) {
            if (graph[now][next] != 1) {
                continue;
            }
            if (visited[next]) {
                continue;
            }
            dfs(next, depth + 1);
        }
    }
    
    static void process() throws IOException {
        answer = -1;
        dfs(S, 0);
        bw.write(answer + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}