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
    static int             lengthOfField;
    static int[][]         field;
    static int             row;
    static int             col;
    static int             nextRow;
    static int             nextCol;
    static Queue<Jelly>    jellyQueue;
    static int[]           dr = {1, 0};
    static int[]           dc = {0, 1};
    static boolean         flag;
    
    static class Jelly {
        
        int row;
        int col;
        
        Jelly(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    
    static boolean isOk(int row, int col) {
        return row >= 0 && row < lengthOfField && col >= 0 && col < lengthOfField;
    }
    
    public static void main(String[] args) throws IOException {
        // read
        lengthOfField = Integer.parseInt(br.readLine());
        field         = new int[lengthOfField][lengthOfField];
        for (int row = 0; row < lengthOfField; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < lengthOfField; col++) {
                field[row][col] = Integer.parseInt(st.nextToken());
            }
        }
        
        // solve
        jellyQueue = new LinkedList<>();
        jellyQueue.add(new Jelly(0, 0));
        
        loop1:
        while (!jellyQueue.isEmpty()) {
            Jelly curJelly = jellyQueue.poll();
            row = curJelly.row;
            col = curJelly.col;
            
            if (field[row][col] == 0) {
                continue;
            }
            
            for (int dir = 0; dir < 2; dir++) {
                nextRow = row + dr[dir] * field[row][col];
                nextCol = col + dc[dir] * field[row][col];
                
                if (!isOk(nextRow, nextCol)) {
                    continue;
                }
                
                if (nextRow == lengthOfField - 1 && nextCol == lengthOfField - 1) {
                    flag = true;
                    break loop1;
                }
                
                jellyQueue.add(new Jelly(nextRow, nextCol));
            }
        }
        
        // write
        if (flag) {
            bw.write("HaruHaru" + "");
        } else {
            bw.write("Hing");
        }
        bw.flush();
        bw.close();
    }
}