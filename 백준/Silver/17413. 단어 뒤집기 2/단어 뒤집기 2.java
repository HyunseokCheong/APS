import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Stack<Character> stack;
    static String string;
    static boolean flag;
    
    static void input() throws IOException {
        string = br.readLine();
    }
    
    static void process() throws IOException {
        stack = new Stack<>();
        flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '<') {
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                flag = true;
                bw.write(string.charAt(i));
                continue;
            }
            if (string.charAt(i) == '>') {
                flag = false;
                bw.write(string.charAt(i));
                continue;
            }
            if (flag) {
                bw.write(string.charAt(i));
            }
            if (!flag) {
                if (string.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(' ');
                } else {
                    stack.push(string.charAt(i));
                }
            }
            if (i == string.length() - 1) {
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
            }
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