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
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             rowOfField;
    static int             colOfField;
    static int             areaCount;
    static int[]           dr = {-1, 1, 0, 0};
    static int[]           dc = {0, 0, -1, 1};
    static int[][]         field;
    static Queue<Node>     queue;
    
    static class Node {
        
        int row;
        int col;
        
        public Node(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static void BFS(int row, int col) {
        queue.add(new Node(row, col));
        field[row][col] = -1;
        areaCount++;
        
        while (!queue.isEmpty()) {
            Node curNode = queue.poll();
            
            for (int dir = 0; dir < 4; dir++) {
                row = curNode.row + dr[dir];
                col = curNode.col + dc[dir];
                
                if (row == -1) {
                    row = rowOfField - 1;
                } else if (row == rowOfField) {
                    row = 0;
                }
                if (col == -1) {
                    col = colOfField - 1;
                } else if (col == colOfField) {
                    col = 0;
                }
                
                if (field[row][col] == 0) {
                    queue.add(new Node(row, col));
                    field[row][col] = -1;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st         = new StringTokenizer(br.readLine());
        rowOfField = Integer.parseInt(st.nextToken());
        colOfField = Integer.parseInt(st.nextToken());
        
        field = new int[rowOfField][colOfField];
        for (int row = 0; row < rowOfField; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < colOfField; col++) {
                field[row][col] = Integer.parseInt(st.nextToken());
            }
        }
        
        // solve
        areaCount = 0;
        queue     = new LinkedList<>();
        for (int row = 0; row < rowOfField; row++) {
            for (int col = 0; col < colOfField; col++) {
                if (field[row][col] == 0) {
                    BFS(row, col);
                }
            }
        }
        
        // write
        bw.write(areaCount + "");
        bw.flush();
        bw.close();
    }
}