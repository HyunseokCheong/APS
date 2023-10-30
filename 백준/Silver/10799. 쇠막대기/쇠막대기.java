import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static char[] line;
    
    static void input() throws IOException {
        line = br.readLine().toCharArray();
    }
    
    static void process() throws IOException {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < line.length; i++) {
            char c = line[i];
            // 열린 괄호
            if (c == '(') {
                stack.push(c);
                continue;
            }
            // 닫힌 괄호 - 레이져
            if (c == ')' && line[i - 1] == '(') {
                stack.pop();
                result += stack.size();
                continue;
            }
            // 닫힌 괄호 - 막대기
            if (c == ')') {
                stack.pop();
                result++;
            }
        }
        
        bw.write(result + "\n");
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