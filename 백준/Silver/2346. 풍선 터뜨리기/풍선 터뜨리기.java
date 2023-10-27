import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] arr;
    static ArrayDeque<int[]> deque;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        deque = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            deque.add(new int[]{i + 1, Integer.parseInt(st.nextToken())});
        }
    }
    
    static void process() throws IOException {
        int[] arr;
        int target;
        while (deque.size() > 1) {
            arr = deque.pollFirst();
            bw.write(arr[0] + " ");
            target = arr[1];
            if (target > 0) {
                for (int i = 1; i < target; i++) {
                    deque.offerLast(deque.pollFirst());
                }
            } else if (target < 0) {
                for (int i = target; i < 0; i++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
        }
        bw.write(deque.poll()[0] + " ");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}