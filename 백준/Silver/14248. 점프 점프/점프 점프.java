import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, s;
    static int[] arr;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        s = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            int plus = cur + arr[cur];
            if (plus > 0 && plus < n + 1 && !visited[plus]) {
                queue.add(plus);
                visited[plus] = true;
            }
            int minus = cur - arr[cur];
            if (minus > 0 && minus < n + 1 && !visited[minus]) {
                queue.add(minus);
                visited[minus] = true;
            }
        }
        int result = 0;
        for (boolean v : visited) {
            if (v) {
                result++;
            }
        }
        bw.write(result + "\n");
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