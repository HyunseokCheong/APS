import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int input;
    static PriorityQueue<Integer> queue;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        queue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            if (input == 0 && queue.isEmpty()) {
                bw.write(0 + "\n");
                continue;
            }
            if (input != 0) {
                queue.add(input);
            }
            if (input == 0) {
                bw.write(queue.poll() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}