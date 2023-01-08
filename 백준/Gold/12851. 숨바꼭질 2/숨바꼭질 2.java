import java.io.*;
import java.util.*;

class Pair {
    
    int idx;
    int sec;
    
    Pair(int idx, int sec) {
        this.idx = idx;
        this.sec = sec;
    }
}

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N, K;
    static int min, cnt;
    static Queue<Pair> queue;
    static boolean[] visited;
    static int idx, sec;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        // solve
        min = Integer.MAX_VALUE;
        cnt = 1;
        
        if (N > K) {
            bw.write(N - K + "\n");
            bw.write(1 + "\n");
        } else {
            queue = new LinkedList<>();
            visited = new boolean[100001];
            sec = 0;
            bfs(N, K);
            bw.write(min + "\n");
            bw.write(cnt + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
    
    static void bfs(int a, int b) {
        queue.add(new Pair(a, sec));
        visited[a] = true;
        
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            idx = p.idx;
            sec = p.sec;
            visited[idx] = true;
            
            // 종료
            if (idx == K) {
                if (min > sec) {
                    min = sec;
                } else if (min == sec) {
                    cnt++;
                }
                continue;
            }
            
            // + 1, -1, * 2
            if (idx + 1 <= 100000 && !visited[idx + 1]) {
                queue.add(new Pair(idx + 1, sec + 1));
            }
            if (idx - 1 >= 0 && !visited[idx - 1]) {
                queue.add(new Pair(idx - 1, sec + 1));
            }
            if (idx * 2 <= 100000 && !visited[idx * 2]) {
                queue.add(new Pair(idx * 2, sec + 1));
            }
        }
    }
}