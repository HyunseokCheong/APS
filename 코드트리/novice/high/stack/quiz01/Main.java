package codeTree.noviceHigh.stack.quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static Stack<Integer> stack;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        stack = new Stack<>();
        while (N-->0){
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    bw.write(stack.pop() + "\n");
                    break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    if (stack.empty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "top":
                    bw.write(stack.peek() + "\n");
                    break;
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}