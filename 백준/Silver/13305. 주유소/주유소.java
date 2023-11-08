import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long[] dist, cost;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        dist = new long[n - 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            dist[i] = Long.parseLong(st.nextToken());
        }
        cost = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cost[i] = Long.parseLong(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        long sum = 0;
        long minCost = cost[0];
        for (int i = 0; i < n - 1; i++) {
            minCost = Math.min(minCost, cost[i]);
            sum += minCost * dist[i];
        }
        bw.write(sum + "\n");
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