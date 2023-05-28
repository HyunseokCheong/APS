import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int                 rowOfField;
    static int                 colOfField;
    static int                 maxMoveLeft;
    static int                 maxMoveRight;
    static int                 maxMoveCount;
    static int                 startRow;
    static int                 startCol;
    static String              input;
    static int[]               dr = {1, -1, 0, 0};
    static int[]               dc = {0, 0, -1, 1};
    static int[][]             field;
    static boolean[][]         visited;
    static PriorityQueue<Node> nodePriorityQueue;
    
    static class Node implements Comparable<Node> {
        
        int row;
        int col;
        int left;
        int right;
        
        public Node(int row, int col, int left, int right) {
            this.row   = row;
            this.col   = col;
            this.left  = left;
            this.right = right;
        }
        
        @Override
        public int compareTo(Node targetNode) {
            return (left + right) <= (targetNode.left + targetNode.right) ? 1 : -1;
        }
    }
    
    public static void solve() {
        nodePriorityQueue = new PriorityQueue<>();
        nodePriorityQueue.add(new Node(startRow, startCol, maxMoveLeft, maxMoveRight));
        visited[startRow][startCol] = true;
        maxMoveCount++;
        
        while (!nodePriorityQueue.isEmpty()) {
            Node curNode = nodePriorityQueue.poll();
            
            for (int direction = 0; direction < 4; direction++) {
                int row   = curNode.row + dr[direction];
                int col   = curNode.col + dc[direction];
                int left  = curNode.left;
                int right = curNode.right;
                
                // 통과 조건
                if (row < 0 || row >= rowOfField || col < 0 || col >= colOfField || field[row][col] == 1
                        || visited[row][col]) {
                    continue;
                }
                
                if (direction == 0) { // upMan
                    visited[row][col] = true;
                    maxMoveCount++;
                    nodePriorityQueue.add(new Node(row, col, left, right));
                } else if (direction == 1) { // downMan
                    visited[row][col] = true;
                    maxMoveCount++;
                    nodePriorityQueue.add(new Node(row, col, left, right));
                } else if (direction == 2) { // leftMan
                    if (left > 0) {
                        visited[row][col] = true;
                        maxMoveCount++;
                        nodePriorityQueue.add(new Node(row, col, left - 1, right));
                    }
                } else { // rightMan
                    if (right > 0) {
                        visited[row][col] = true;
                        maxMoveCount++;
                        nodePriorityQueue.add(new Node(row, col, left, right - 1));
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st           = new StringTokenizer(br.readLine());
        rowOfField   = Integer.parseInt(st.nextToken());
        colOfField   = Integer.parseInt(st.nextToken());
        st           = new StringTokenizer(br.readLine());
        maxMoveLeft  = Integer.parseInt(st.nextToken());
        maxMoveRight = Integer.parseInt(st.nextToken());
        
        field   = new int[rowOfField][colOfField];
        visited = new boolean[rowOfField][colOfField];
        for (int row = 0; row < rowOfField; row++) {
            input = br.readLine();
            for (int col = 0; col < colOfField; col++) {
                field[row][col] = Character.getNumericValue(input.charAt(col));
                
                if (field[row][col] == 2) {
                    startRow        = row;
                    startCol        = col;
                    field[row][col] = 0;
                }
            }
        }
        
        // solve
        solve();
        
        // write
        bw.write(maxMoveCount + "");
        bw.flush();
        bw.close();
    }
}