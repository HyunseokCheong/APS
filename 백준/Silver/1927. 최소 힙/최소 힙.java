import java.io.*;
import java.util.PriorityQueue;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            if (x == 0 && pq.isEmpty()) {
                bw.write(0 + "\n");
                continue;
            }
            if (x == 0) {
                bw.write(pq.poll() + "\n");
                continue;
            }
            pq.add(x);
        }
        bw.flush();
        bw.close();
    }
}