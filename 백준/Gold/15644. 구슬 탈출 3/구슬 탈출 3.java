import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
    static String          input;
    static char[][]        field;
    static boolean[][][][] visited;
    static int             count;
    static String          path;
    static int             tempCount;
    static int             redRow;
    static int             redCol;
    static int             redNextRow;
    static int             redNextCol;
    static int             redNextCount;
    static int             blueRow;
    static int             blueCol;
    static int             blueNextRow;
    static int             blueNextCol;
    static int             blueNextCount;
    static int             holeRow;
    static int             holeCol;
    static int[]           dr = {-1, 1, 0, 0};
    static int[]           dc = {0, 0, -1, 1};
    static Queue<Node>     nodeQueue;
    
    static class Node {
        
        int    redRow;
        int    redCol;
        int    blueRow;
        int    blueCol;
        int    row;
        int    col;
        int    count;
        String path;
        
        public Node(int redRow, int redCol, int blueRow, int blueCol, int count, String path) {
            this.redRow  = redRow;
            this.redCol  = redCol;
            this.blueRow = blueRow;
            this.blueCol = blueCol;
            this.count   = count;
            this.path    = path;
        }
        
        public Node(int row, int col, int count) {
            this.row   = row;
            this.col   = col;
            this.count = count;
        }
    }
    
    static void init() throws IOException {
        st         = new StringTokenizer(br.readLine());
        rowOfField = Integer.parseInt(st.nextToken());
        colOfField = Integer.parseInt(st.nextToken());
        field      = new char[rowOfField][colOfField];
        for (int row = 0; row < rowOfField; row++) {
            input = br.readLine();
            for (int col = 0; col < colOfField; col++) {
                field[row][col] = input.charAt(col);
                
                if (field[row][col] == 'R') {
                    redRow = row;
                    redCol = col;
                } else if (field[row][col] == 'B') {
                    blueRow = row;
                    blueCol = col;
                } else if (field[row][col] == 'O') {
                    holeRow = row;
                    holeCol = col;
                }
            }
        }
    }
    
    static void solve() throws IOException {
        nodeQueue = new LinkedList<>();
        visited   = new boolean[rowOfField][colOfField][rowOfField][colOfField];
        
        nodeQueue.add(new Node(redRow, redCol, blueRow, blueCol, 1, ""));
        visited[redRow][redCol][blueRow][blueCol] = true;
        
        while (!nodeQueue.isEmpty()) {
            Node curNode = nodeQueue.poll();
            redRow  = curNode.redRow;
            redCol  = curNode.redCol;
            blueRow = curNode.blueRow;
            blueCol = curNode.blueCol;
            count   = curNode.count;
            path    = curNode.path;
            
            if (count > 10) {
                break;
            }
            
            for (int dir = 0; dir < 4; dir++) {
                Node redNode  = move(redRow, redCol, dr[dir], dc[dir]);
                Node blueNode = move(blueRow, blueCol, dr[dir], dc[dir]);
                redNextRow    = redNode.row;
                redNextCol    = redNode.col;
                redNextCount  = redNode.count;
                blueNextRow   = blueNode.row;
                blueNextCol   = blueNode.col;
                blueNextCount = blueNode.count;
                
                String tempPath = dir == 0 ? "U" : dir == 1 ? "D" : dir == 2 ? "L" : "R";
                
                if (field[blueNextRow][blueNextCol] != 'O') {
                    if (field[redNextRow][redNextCol] == 'O') {
                        bw.write(count + "\n" + path + tempPath + "");
                        return;
                    }
                    
                    if (redNextRow == blueNextRow && redNextCol == blueNextCol) {
                        if (redNextCount > blueNextCount) {
                            redNextRow -= dr[dir];
                            redNextCol -= dc[dir];
                        } else {
                            blueNextRow -= dr[dir];
                            blueNextCol -= dc[dir];
                        }
                    }
                    
                    if (!visited[redNextRow][redNextCol][blueNextRow][blueNextCol]) {
                        nodeQueue.add(
                                new Node(redNextRow, redNextCol, blueNextRow, blueNextCol, count + 1, path + tempPath));
                        visited[redNextRow][redNextCol][blueNextRow][blueNextCol] = true;
                    }
                }
            }
        }
        bw.write(-1 + "");
    }
    
    static Node move(int row, int col, int nextRow, int nextCol) {
        tempCount = 0;
        while (true) {
            if (row + nextRow < 0 || col + nextCol < 0 || row + nextRow >= rowOfField || col + nextCol >= colOfField) {
                break;
            }
            
            if (field[row + nextRow][col + nextCol] != '#' && field[row][col] != 'O') {
                row += nextRow;
                col += nextCol;
                tempCount++;
            } else {
                break;
            }
        }
        
        return new Node(row, col, tempCount);
    }
    
    public static void main(String[] args) throws IOException {
        init();
        solve();
        bw.flush();
        bw.close();
    }
}