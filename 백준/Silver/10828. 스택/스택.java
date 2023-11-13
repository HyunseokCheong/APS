import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Stack<Integer> stack;
    
    static void push(int x) {
        stack.push(x);
    }
    
    static int pop() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.pop();
    }
    
    static int size() {
        return stack.size();
    }
    
    static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }
    
    static int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }
    
    public static void main(String[] args) throws IOException {
        stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        
        String operator;
        int x;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            operator = st.nextToken();
            if ("push".equals(operator)) {
                x = Integer.parseInt(st.nextToken());
                push(x);
            }
            if ("pop".equals(operator)) {
                bw.write(pop() + "\n");
            }
            if ("size".equals(operator)) {
                bw.write(size() + "\n");
            }
            if ("empty".equals(operator)) {
                bw.write(empty() + "\n");
            }
            if ("top".equals(operator)) {
                bw.write(top() + "\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}