import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static LinkedList<Integer> deque = new LinkedList<>();
    static int answer = 0;

    static boolean ok(int a) {
        for (int i = 0; i <= deque.size() / 2; i++) {
            if (a == deque.get(i)) return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) arr[i] = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) deque.add(i);
        for (int i = 0; i < m; i++) {
            if (ok(arr[i])) {
                while (arr[i] != deque.get(0)) {
                    deque.addLast(deque.pollFirst());
                    answer++;
                }
            }else {
                while (arr[i] != deque.get(0)) {
                    deque.addFirst(deque.pollLast());
                    answer++;
                }
            }
            deque.poll();
        }
        bw.write(answer + "\n"); bw.flush(); bw.close();
    }
}