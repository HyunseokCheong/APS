import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, result;
    static String op;
    static Deque<Integer> deque;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        deque = new LinkedList<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            op = st.nextToken();
            switch (op) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    continue;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    continue;
                case "pop_front":
                    result = deque.isEmpty() ? -1 : deque.pollFirst();
                    break;
                case "pop_back":
                    result = deque.isEmpty() ? -1 : deque.pollLast();
                    break;
                case "size":
                    result = deque.size();
                    break;
                case "empty":
                    result = deque.isEmpty() ? 1 : 0;
                    break;
                case "front":
                    result = deque.isEmpty() ? -1 : deque.peekFirst();
                    break;
                case "back":
                    result = deque.isEmpty() ? -1 : deque.peekLast();
                    break;
            }
            bw.write(result + "\n");
        }
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