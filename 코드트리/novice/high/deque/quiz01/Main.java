package codeTree.noviceHigh.deque.quiz01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static Deque<Integer> deque;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        deque = new LinkedList<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    bw.write(deque.pollFirst() + "\n");
                    break;
                case "pop_back":
                    bw.write(deque.pollLast() + "\n");
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        bw.write(1 + "\n");
                    } else {
                        bw.write(0 + "\n");
                    }
                    break;
                case "front":
                    bw.write(deque.peekFirst() + "\n");
                    break;
                case "back":
                    bw.write(deque.peekLast() + "\n");
                    break;
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}