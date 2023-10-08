import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static Queue<Integer> queue;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            queue.add(i);
        }
    }
    
    static void process() throws IOException {
        while (queue.size() != 1) {
            bw.write(queue.poll() + " ");
            queue.add(queue.poll());
        }
        bw.write(queue.poll() + "\n");
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