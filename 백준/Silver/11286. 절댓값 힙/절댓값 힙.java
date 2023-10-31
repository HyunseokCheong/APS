import java.io.*;
import java.util.PriorityQueue;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static PriorityQueue<Integer> priorityQueue;
    static int n;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);
            if (abs1 == abs2) {
                return o1 - o2;
            }
            return abs1 - abs2;
        });
    }
    
    static void process() throws IOException {
        for (int i = 0; i < n; i++) {
            int op = Integer.parseInt(br.readLine());
            if (op == 0 && priorityQueue.isEmpty()) {
                bw.write(0 + "\n");
                continue;
            }
            if (op == 0) {
                bw.write(priorityQueue.poll() + "\n");
                continue;
            }
            priorityQueue.add(op);
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