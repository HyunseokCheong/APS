import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> que = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) que.add(i);

        bw.write("<");
        while (que.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                que.offer(que.poll());
            }
            bw.write(que.poll() + ", ");
        }
        bw.write(que.poll() + ">");
        bw.flush();
        bw.close();
    }
}