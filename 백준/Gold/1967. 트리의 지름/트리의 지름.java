import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    
    static class Node {
        int number;
        int length;
        
        public Node(int number, int length) {
            this.number = number;
            this.length = length;
        }
    }
    
    static List<Node>[] nodeList;
    static boolean[] visited;
    static int answer;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        nodeList = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            nodeList[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            stk();
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int len = Integer.parseInt(st.nextToken());
            nodeList[from].add(new Node(to, len));
            nodeList[to].add(new Node(from, len));
        }
    }
    
    static void solve() throws IOException {
        answer = 0;
        for (int i = 1; i <= n; i++) {
            visited = new boolean[n + 1];
            visited[i] = true;
            dfs(i, 0);
        }
        bw.write(answer + "\n");
    }
    
    static void dfs(int num, int dim) {
        for (Node node : nodeList[num]) {
            if (!visited[node.number]) {
                visited[node.number] = true;
                dfs(node.number, dim + node.length);
            }
        }
        answer = Math.max(answer, dim);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}