import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, k; // 0 <= n, k <= 100,000

    // process
    static int cur;
    static int[] visited;
    static Queue<Integer> queue;

    public static int bfs(int n, int k) {
        queue = new LinkedList<>();
        visited = new int[100001];
        queue.add(n);
        visited[n] = 1;
        while (!queue.isEmpty()) {
            cur = queue.poll();
            if (cur == k) break;
            if (cur - 1 >= 0 && (visited[cur - 1] > visited[cur] || visited[cur - 1] == 0)) {
                queue.add(cur - 1);
                visited[cur - 1] = visited[cur] + 1;
            }
            if (cur + 1 <= 100000 && (visited[cur + 1] > visited[cur] || visited[cur + 1] == 0)) {
                queue.add(cur + 1);
                visited[cur + 1] = visited[cur] + 1;
            }
            if (cur * 2 <= 100000 && (visited[cur * 2] > visited[cur] || visited[cur * 2] == 0)) {
                queue.add(cur * 2);
                visited[cur * 2] = visited[cur] + 1;
            }
        }
        return visited[cur] - 1;
    }

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // process
        answer = bfs(n, k);

        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}