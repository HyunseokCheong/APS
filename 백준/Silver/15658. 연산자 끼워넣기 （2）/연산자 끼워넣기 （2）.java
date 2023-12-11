import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, minV, maxV;
    static int[] arr, op;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        op = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            op[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        minV = Integer.MAX_VALUE;
        maxV = Integer.MIN_VALUE;
        DFS(arr[0], 1);
        bw.write(maxV + "\n" + minV + "\n");
    }
    
    static void DFS(int v, int depth) {
        if (depth == n) {
            minV = Math.min(minV, v);
            maxV = Math.max(maxV, v);
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (op[i] == 0) {
                continue;
            }
            int nextV = i == 0 ? v + arr[depth] : i == 1 ? v - arr[depth] : i == 2 ? v * arr[depth] : v / arr[depth];
            int nextDepth = depth + 1;
            op[i]--;
            DFS(nextV, nextDepth);
            op[i]++;
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