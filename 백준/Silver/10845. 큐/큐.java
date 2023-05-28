import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int last = 0;
        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    que.offer(last); // 큐 맨 뒤에 삽입
                    break;
                case "pop":
                    if (que.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(que.poll() + "\n"); // pop
                    break;
                case "size":
                    bw.write(que.size() + "\n");
                    break;
                case "empty":
                    if (que.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;
                case "front":
                    if (que.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(que.peek() + "\n");
                    break;
                case "back":
                    if (que.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(last + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}