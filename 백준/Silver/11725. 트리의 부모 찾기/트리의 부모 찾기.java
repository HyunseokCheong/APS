import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static List<Integer>[] tree;
    static int[] parent;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        tree = new List[n + 1];
        for (int i = 1; i < n + 1; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree[a].add(b);
            tree[b].add(a);
        }
    }
    
    static void dfs(int idx) {
        for (int next : tree[idx]) {
            if (parent[next] == 0) {
                parent[next] = idx;
                dfs(next);
            }
        }
    }
    
    static void process() throws IOException {
        parent = new int[n + 1];
        dfs(1);
        for (int i = 2; i < n + 1; i++) {
            bw.write(parent[i] + "\n");
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