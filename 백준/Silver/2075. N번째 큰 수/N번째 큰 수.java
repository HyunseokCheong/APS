import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static PriorityQueue<Integer> pq;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        }
    }
    
    static void process() throws IOException {
        for (int i = 0; i < n - 1; i++) {
            pq.poll();
        }
        bw.write(pq.poll() + "\n");
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