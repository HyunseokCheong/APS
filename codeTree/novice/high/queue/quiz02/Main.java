package codeTree.noviceHigh.queue.quiz02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N, K;
    static Queue<Integer> queue;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        queue = new LinkedList<>();
        for (int i = 1; i < N + 1; i++) {
            queue.add(i);
        }
        
        // solve
        while (queue.size() != 1) {
            for (int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }
            bw.write(queue.poll() + " ");
        }
        bw.write(queue.poll() + "");
        
        // write
        bw.flush();
        bw.close();
    }
}