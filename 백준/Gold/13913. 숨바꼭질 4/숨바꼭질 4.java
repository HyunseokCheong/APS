import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, k, nowPosition, idx;
    static int[] visited, parent;
    static Stack<Integer> stack;
    static Queue<Integer> queue;

    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
    }

    static void solve() throws IOException {
        visited = new int[100001];
        parent = new int[100001];
        bfs(n, k);
        bw.write(visited[k] + "\n");
        stack = new Stack<>();
        idx = k;
        while (idx != n) {
            stack.push(idx);
            idx = parent[idx];
        }
        stack.push(idx);
        while (!stack.isEmpty()) {
            bw.write(stack.pop() + " ");
        }
        bw.flush();
        bw.close();
    }

    static void bfs(int start, int end) {
        if (start == end) return;
        queue = new LinkedList<>();
        queue.add(start);
        visited[start] = 0;

        while (!queue.isEmpty()) {
            nowPosition = queue.poll();
            if (visited[end] != 0) return;
            if (nowPosition + 1 <= 100000 && visited[nowPosition + 1] == 0) {
                queue.add(nowPosition + 1);
                visited[nowPosition + 1] = visited[nowPosition] + 1;
                parent[nowPosition + 1] = nowPosition;
            }
            if (nowPosition - 1 >= 0 && visited[nowPosition - 1] == 0) {
                queue.add(nowPosition - 1);
                visited[nowPosition - 1] = visited[nowPosition] + 1;
                parent[nowPosition - 1] = nowPosition;
            }
            if (nowPosition * 2 <= 100000 && visited[nowPosition * 2] == 0) {
                queue.add(nowPosition * 2);
                visited[nowPosition * 2] = visited[nowPosition] + 1;
                parent[nowPosition * 2] = nowPosition;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
    }
}