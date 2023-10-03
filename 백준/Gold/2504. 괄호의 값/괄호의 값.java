import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Stack<Character> stack;
    static String string;
    static int answer, count;
    static boolean flag;
    
    static void input() throws IOException {
        string = br.readLine();
    }
    
    static void process() throws IOException {
        stack = new Stack<>();
        answer = 0;
        count = 1;
        flag = true;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '(') {
                stack.push(c);
                count *= 2;
                continue;
            }
            if (c == '[') {
                stack.push(c);
                count *= 3;
                continue;
            }
            if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    flag = false;
                    break;
                }
                if (string.charAt(i - 1) == '(') {
                    answer += count;
                }
                stack.pop();
                count /= 2;
                continue;
            }
            if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    flag = false;
                    break;
                }
                if (string.charAt(i - 1) == '[') {
                    answer += count;
                }
                stack.pop();
                count /= 3;
                continue;
            }
            flag = false;
            break;
        }
        if (!flag || !stack.isEmpty()) {
            bw.write(0 + "\n");
            return;
        }
        bw.write(answer + "\n");
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