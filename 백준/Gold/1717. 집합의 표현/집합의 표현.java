import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] parent;
    static int o, a, b;
    static Set<Integer>[] sets;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        initParent();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            o = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            if (o == 0) {
                union(a, b);
                continue;
            }
            bw.write(isSameParent(a, b) ? "YES" + "\n" : "NO" + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static void initParent() {
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
    }
    
    static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    static void union(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (x < y) {
            parent[y] = x;
            return;
        }
        parent[x] = y;
    }
    
    static boolean isSameParent(int x, int y) {
        x = find(x);
        y = find(y);
        
        return x == y;
    }
}