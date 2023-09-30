import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, input;
    static PriorityQueue<Integer> minQ, maxQ;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        // 1 2 3 4 5
        minQ = new PriorityQueue<>();
        // 5 4 3 2 1
        maxQ = new PriorityQueue<>(((o1, o2) -> o2 - o1));
        
        for (int i = 0; i < n; i++) {
            input = Integer.parseInt(br.readLine());
            if (minQ.size() == maxQ.size()) {
                maxQ.add(input);
                if (!minQ.isEmpty() && maxQ.peek() > minQ.peek()) {
                    minQ.add(maxQ.poll());
                    maxQ.add(minQ.poll());
                }
            } else {
                minQ.add(input);
                if (maxQ.peek() > minQ.peek()) {
                    minQ.add(maxQ.poll());
                    maxQ.add(minQ.poll());
                }
            }
            bw.write(maxQ.peek() + "\n");
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