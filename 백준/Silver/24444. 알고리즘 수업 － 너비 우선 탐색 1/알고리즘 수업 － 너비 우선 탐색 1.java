import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader      br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter      bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer     st;
    static String              endl  = "\n";
    static String              blank = " ";
    static int                 N;
    static int                 M;
    static int                 R;
    static int                 A;
    static int                 B;
    static int                 count;
    static int                 cur;
    static int                 next;
    static List<List<Integer>> li    = new ArrayList<>();
    static int[]               visited;
    
    
    static void input() throws IOException {
        stk();
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i <= N; i++) {
            li.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            stk();
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            li.get(A).add(B);
            li.get(B).add(A);
        }
    }
    
    static void process() throws IOException {
        for (int i = 1; i <= N; i++) {
            Collections.sort(li.get(i));
        }
        visited = new int[N + 1];
        
        BFS(R);
        
        for (int i = 1; i <= N; i++) {
            bw.write(visited[i] + endl);
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        count = 1;
        queue.offer(index);
        visited[index] = count++;
        
        while (!queue.isEmpty()) {
            cur = queue.poll();
            
            for (int i = 0; i < li.get(cur).size(); i++) {
                next = li.get(cur).get(i);
                
                if (visited[next] != 0) {
                    continue;
                }
                
                queue.offer(next);
                visited[next] = count++;
            }
        }
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}