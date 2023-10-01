import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input, c4;
    static int inputLength, c4Length;
    static Stack<Character> stack;
    
    static void input() throws IOException {
        input = br.readLine();
        c4 = br.readLine();
    }
    
    static void process() throws IOException {
        inputLength = input.length();
        c4Length = c4.length();
        stack = new Stack<>();
        for (int i = 0; i < inputLength; i++) {
            stack.push(input.charAt(i));
            if (stack.size() >= c4Length) {
                boolean flag = true;
                for (int j = 0; j < c4Length; j++) {
                    if (stack.get(stack.size() - c4Length + j) != c4.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < c4Length; j++) {
                        stack.pop();
                    }
                }
            }
        }
        if (stack.isEmpty()) {
            bw.write("FRULA" + "\n");
            return;
        }
        for (Character c : stack) {
            bw.write(c);
        }
        bw.write("\n");
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