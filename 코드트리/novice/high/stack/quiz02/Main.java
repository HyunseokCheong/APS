package codeTree.noviceHigh.stack.quiz02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input, answer;
    static Stack<Character> stack;
    
    public static void main(String[] args) throws IOException {
        // read
        input = br.readLine();
        
        // solve
        answer = "Yes";
        stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            } else {
                if (stack.empty()) {
                    answer = "No";
                    break;
                } else if (stack.peek() != '(') {
                    answer = "No";
                    break;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.empty()) {
            answer = "No";
        }
        
        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}