import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, height;
    static int[] histogram;
    static Stack<Integer> stack;
    static long maxArea, width;
    
    static void read() throws IOException {
        n = Integer.parseInt(br.readLine());
        if (n == 0) return;
        histogram = new int[n];
        for (int i = 0; i < n; i++) histogram[i] = Integer.parseInt(br.readLine());
    }
    
    static void solve() {
        stack = new Stack<>();
        maxArea = 0;
        for (int i = 0; i < n; i++) {
            while ((!stack.isEmpty()) && (histogram[stack.peek()] >= histogram[i])) {
                height = histogram[stack.pop()];
                if (stack.isEmpty()) width = i;
                else width = i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            height = histogram[stack.pop()];
            if (stack.isEmpty()) width = n;
            else width = n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }
    }
    
    static void write() throws IOException {
        bw.write(maxArea + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        read();
        solve();
        write();
        bw.flush();
        bw.close();
    }
}