import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, v, a, b;
    static int[][] map;
    static boolean[] visited;
    static Queue<Integer> queue;


    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());

        map = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            map[a][b] = map[b][a] = 1;
        }

        visited = new boolean[n + 1];
        dfs(v);
        bw.write("\n");
        visited = new boolean[n + 1];
        queue = new LinkedList<>();
        bfs(v);
    }

    static void dfs(int v) throws IOException {
        visited[v] = true;
        bw.write(v + " ");
        for (int i = 1; i <= n; i++) {
            if (map[v][i] == 1 && !visited[i]) dfs(i);
        }
    }

    static void bfs(int v) throws IOException {
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            v = queue.poll();
            bw.write(v + " ");

            for (int i = 1; i <= n; i++) {
                if (map[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        bw.flush();
        bw.close();
    }
}