import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input;
    static Stack<Character> stack;
    static int result;
    
    public static void main(String[] args) throws IOException {
        input = br.readLine();
        stack = new Stack<>();
        result = 0;
        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            if (cur == '(') {
                stack.push(cur);
                continue;
            }
            if (input.charAt(i - 1) == '(') {
                stack.pop();
                result += stack.size();
                continue;
            }
            stack.pop();
            result++;
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}