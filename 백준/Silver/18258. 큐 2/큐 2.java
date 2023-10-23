import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, result;
    static String op;
    static Deque<Integer> queue;
    
    static void push(int x) {
        queue.add(x);
    }
    
    static int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.poll();
    }
    
    static int size() {
        return queue.size();
    }
    
    static int empty() {
        return queue.isEmpty() ? 1 : 0;
    }
    
    static int front() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peekFirst();
    }
    
    static int back() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peekLast();
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        queue = new LinkedList<>();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            op = st.nextToken();
            switch (op) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    continue;
                case "pop":
                    result = pop();
                    break;
                case "size":
                    result = size();
                    break;
                case "empty":
                    result = empty();
                    break;
                case "front":
                    result = front();
                    break;
                case "back":
                    result = back();
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