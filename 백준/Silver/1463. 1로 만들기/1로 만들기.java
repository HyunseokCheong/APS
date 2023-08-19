import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, answer, now;
    static int[] visited;
    static Queue<Integer> queue;

    static void read() throws IOException {
        n = Integer.parseInt(br.readLine()); // 1 <= n <= 10^6
    }

    static void solve() throws IOException {
        visited = new int[n + 1];
        bfs();
        answer = visited[1] - 1;
    }

    static void write() throws IOException {
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    static void bfs() {
        queue = new LinkedList<>();
        queue.add(n);
        visited[n] = 1;

        while (!queue.isEmpty()) {
            now = queue.poll();
            if (now == 1) break;
            for (int i = 0; i < 3; i++) {
                if (i == 0) {
                    if (now % 3 == 0 && visited[now / 3] == 0) {
                        queue.add(now / 3);
                        visited[now / 3] = visited[now] + 1;
                    }
                } else if (i == 1) {
                    if (now % 2 == 0 && visited[now / 2] == 0) {
                        queue.add(now / 2);
                        visited[now / 2] = visited[now] + 1;
                    }
                } else {
                    if (visited[now - 1] == 0) {
                        queue.add(now - 1);
                        visited[now - 1] = visited[now] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
        write();
    }
}