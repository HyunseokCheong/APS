import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static Stack<Character> charStack;
    static char[] line;
    static final String YES = "YES" + "\n", NO = "NO" + "\n";
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        loop1:
        for (int i = 0; i < n; i++) {
            charStack = new Stack<>();
            line = br.readLine().toCharArray();
            for (char c : line) {
                // 여는 괄호는 스택에 추가
                if (c == '(') {
                    charStack.push(c);
                    continue;
                }
                // 닫는 괄호는
                if (c == ')') {
                    // 스택이 비어 있으면 X
                    if (charStack.isEmpty()) {
                        bw.write(NO);
                        continue loop1;
                    }
                    // 스택의 상단이 여는 괄호가 아니면 X
                    if (charStack.pop() != '(') {
                        bw.write(NO);
                        continue loop1;
                    }
                }
            }
            // 스택이 비어 있지 않으면 X
            if (!charStack.isEmpty()) {
                bw.write(NO);
                continue;
            }
            // 모든 조건 통과
            bw.write(YES);
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