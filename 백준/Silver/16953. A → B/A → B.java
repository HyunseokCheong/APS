import java.io.*;
import java.util.*;

public class Main {
    // declare
    static long a, b, now;
    static int answer, size;
    static Queue<Long> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());

        // print
        System.out.println(bfs());
    }

    static long bfs() {
        answer = 0;
        q = new LinkedList<>();
        q.add(a);

        while (!q.isEmpty()) {
            size = q.size();
            for (int i = 0; i < size; i++) {
                now = q.poll();
                if (now == b) return answer + 1;
                if (now * 2 <= b) q.add(now * 2);
                if (now * 10 + 1 <= b) q.add(now * 10 + 1);
            }
            answer++;
        }
        return -1;
    }
}