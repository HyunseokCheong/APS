import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader        br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter        bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer       st;
    static int                   numberOfNode;
    static int                   numberOfEdge;
    static int                   startNode;
    static int                   start;
    static int                   end;
    static int                   count;
    static long                  answer;
    static int[]                 path;
    static long[]                depthList;
    static boolean[]             visited;
    static LinkedList<Integer>[] graph;
    
    static void DFS(int startNode, long depth) {
        Iterator<Integer> iterator = graph[startNode].listIterator();
        visited[startNode]   = true;
        path[startNode]      = ++count;
        depthList[startNode] = depth;
        while (iterator.hasNext()) {
            int nextNode = iterator.next();
            if (!visited[nextNode]) {
                DFS(nextNode, depth + 1);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st           = new StringTokenizer(br.readLine());
        numberOfNode = Integer.parseInt(st.nextToken());
        numberOfEdge = Integer.parseInt(st.nextToken());
        startNode    = Integer.parseInt(st.nextToken());
        
        graph = new LinkedList[numberOfNode + 1];
        for (int i = 1; i <= numberOfNode; i++) {
            graph[i] = new LinkedList<>();
        }
        
        for (int i = 1; i <= numberOfEdge; i++) {
            st    = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end   = Integer.parseInt(st.nextToken());
            
            graph[start].add(end);
            graph[end].add(start);
        }
        // solve
        path      = new int[numberOfNode + 1];
        depthList = new long[numberOfNode + 1];
        visited   = new boolean[numberOfNode + 1];
        count     = 0;
        for (int i = 1; i <= numberOfNode; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }
        
        DFS(startNode, 0);
        
        // write
        answer = 0;
        for (int i = 1; i <= numberOfNode; i++) {
            answer += path[i] * depthList[i];
        }
        
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}