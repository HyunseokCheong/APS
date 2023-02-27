
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             numberOfStone;
    static int             startStone;
    static int             endStone;
    static int             curPosition;
    static int             nextPosition;
    static int             count;
    static Queue<Node>     queue;
    static int[]           stones;
    static boolean[]       visited;
    
    static class Node {
        
        int position;
        int count;
        
        public Node(int position, int count) {
            this.position = position;
            this.count    = count;
        }
    }
    
    static void input() throws IOException {
        numberOfStone = Integer.parseInt(br.readLine());
        stones        = new int[numberOfStone + 1];
        stk();
        for (int i = 1; i <= numberOfStone; i++) {
            stones[i] = Integer.parseInt(st.nextToken());
        }
        stk();
        startStone = Integer.parseInt(st.nextToken());
        endStone   = Integer.parseInt(st.nextToken());
    }
    
    static void process() {
        queue   = new LinkedList<>();
        visited = new boolean[numberOfStone + 1];
        
        queue.add(new Node(startStone, 0));
        visited[startStone] = true;
        
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            
            curPosition = node.position;
            count       = node.count;
            
            if (curPosition == endStone) {
                System.out.println(count);
                System.exit(0);
            }
            
            for (int i = 1; curPosition + stones[curPosition] * i <= numberOfStone; i++) {
                
                nextPosition = curPosition + stones[curPosition] * i;
                if (!visited[nextPosition]) {
                    queue.add(new Node(nextPosition, count + 1));
                    visited[nextPosition] = true;
                }
            }
            
            for (int i = 1; curPosition - stones[curPosition] * i >= 1; i++) {
                
                nextPosition = curPosition - stones[curPosition] * i;
                if (!visited[nextPosition]) {
                    queue.add(new Node(nextPosition, count + 1));
                    visited[nextPosition] = true;
                }
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(-1 + blank);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}