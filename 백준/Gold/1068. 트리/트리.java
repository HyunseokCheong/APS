import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, d;
    static int root, count;
    static List<Integer>[] tree;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        tree = new List[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }
        root = 0;
        st = new StringTokenizer(br.readLine());
        for (int child = 0; child < n; child++) {
            int parent = Integer.parseInt(st.nextToken());
            if (parent == -1) {
                root = child;
                continue;
            }
            tree[parent].add(child);
        }
        d = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        if (root == d) {
            bw.write(0 + "\n");
            return;
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (tree[i].contains(d)) {
                tree[i].remove((Integer) d);
            }
        }
        recur(root);
        bw.write(count + "\n");
    }
    
    static void recur(int parent) {
        if (parent == d) {
            return;
        }
        if (tree[parent].isEmpty()) {
            count++;
            return;
        }
        for (int child : tree[parent]) {
            recur(child);
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