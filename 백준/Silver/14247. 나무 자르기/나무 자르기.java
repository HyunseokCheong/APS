import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long result;
    static List<Tree> treeList;
    static PriorityQueue<Tree> treeQueue;
    
    static class Tree {
        int height;
        int grow;
        
        public Tree(int height) {
            this.height = height;
        }
        
        void setGrow(int grow) {
            this.grow = grow;
        }
        
        int getTotalHeight(int index) {
            return height + grow * index;
        }
    }
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        treeList = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            treeList.add(new Tree(Integer.parseInt(st.nextToken())));
        }
        st = new StringTokenizer(br.readLine());
        for (Tree tree : treeList) {
            tree.setGrow(Integer.parseInt(st.nextToken()));
        }
    }
    
    static void process() throws IOException {
        treeQueue = new PriorityQueue<>((o1, o2) -> o1.grow - o2.grow);
        treeQueue.addAll(treeList);
        result = 0;
        int index = 0;
        while (!treeQueue.isEmpty()) {
            Tree tree = treeQueue.poll();
            result += tree.getTotalHeight(index);
            index++;
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