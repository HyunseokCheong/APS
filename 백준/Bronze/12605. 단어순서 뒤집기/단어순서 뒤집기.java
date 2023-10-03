import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String[] a;
    static Stack<String> stack;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            a = br.readLine().split(" ");
            for (String s : a) {
                stack.push(s);
            }
            bw.write("Case #" + i + ": ");
            while (!stack.isEmpty()) {
                bw.write(stack.pop() + " ");
            }
            bw.write("\n");
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