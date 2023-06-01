import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader   br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter   bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer  st;
    static int              lengthOfField;
    static int              numberOfTree;
    static int              yearToSimulation;
    static int              X;
    static int              Y;
    static int              age;
    static int              nextX;
    static int              nextY;
    static int[]            dr = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[]            dc = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int[][]          fieldOfAddFood;
    static int[][]          fieldOfFood;
    static LinkedList<Tree> trees;
    static Queue<Tree>      deadTrees;
    static LinkedList<Tree> breedTrees;
    static Tree             nowTree;
    
    static class Tree {
        
        int X;
        int Y;
        int age;
        
        public Tree(int x, int y, int age) {
            this.X   = x;
            this.Y   = y;
            this.age = age;
        }
    }
    
    static void simulate() {
        // Spring
        Iterator<Tree> iterator = trees.iterator();
        while (iterator.hasNext()) {
            nowTree = iterator.next();
            X       = nowTree.X;
            Y       = nowTree.Y;
            age     = nowTree.age;
            
            if (fieldOfFood[X][Y] < age) {
                deadTrees.offer(nowTree);
                iterator.remove();
            } else {
                fieldOfFood[X][Y] -= age;
                nowTree.age++;
            }
        }
        
        // Summer
        while (!deadTrees.isEmpty()) {
            nowTree = deadTrees.poll();
            X       = nowTree.X;
            Y       = nowTree.Y;
            age     = nowTree.age;
            fieldOfFood[X][Y] += age / 2;
        }
        
        // Fall
        breedTrees = new LinkedList<>();
        for (Tree tree : trees) {
            X   = tree.X;
            Y   = tree.Y;
            age = tree.age;
            
            if (age % 5 == 0) {
                for (int direction = 0; direction < 8; direction++) {
                    nextX = X + dr[direction];
                    nextY = Y + dc[direction];
                    
                    if (nextX < 1 || nextY < 1 || nextX > lengthOfField || nextY > lengthOfField) {
                        continue;
                    }
                    
                    breedTrees.add(new Tree(nextX, nextY, 1));
                }
            }
        }
        trees.addAll(0, breedTrees);
        
        // Winter
        for (int row = 1; row <= lengthOfField; row++) {
            for (int col = 1; col <= lengthOfField; col++) {
                fieldOfFood[row][col] += fieldOfAddFood[row][col];
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        // read
        st               = new StringTokenizer(br.readLine());
        lengthOfField    = Integer.parseInt(st.nextToken());
        numberOfTree     = Integer.parseInt(st.nextToken());
        yearToSimulation = Integer.parseInt(st.nextToken());
        
        fieldOfAddFood = new int[lengthOfField + 1][lengthOfField + 1];
        fieldOfFood    = new int[lengthOfField + 1][lengthOfField + 1];
        
        for (int row = 1; row <= lengthOfField; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 1; col <= lengthOfField; col++) {
                fieldOfAddFood[row][col] = Integer.parseInt(st.nextToken());
                fieldOfFood[row][col]    = 5;
            }
        }
        
        trees     = new LinkedList<>();
        deadTrees = new LinkedList<>();
        
        for (int i = 0; i < numberOfTree; i++) {
            st  = new StringTokenizer(br.readLine());
            X   = Integer.parseInt(st.nextToken());
            Y   = Integer.parseInt(st.nextToken());
            age = Integer.parseInt(st.nextToken());
            trees.add(new Tree(X, Y, age));
        }
        
        // solve
        while (yearToSimulation-- > 0) {
            simulate();
        }
        
        // write
        bw.write(trees.size() + "");
        bw.flush();
        bw.close();
    }
}