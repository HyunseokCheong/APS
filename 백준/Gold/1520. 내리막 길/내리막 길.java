import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             rowOfField;
    static int             colOfField;
    static int             count;
    static int[]           dr = {-1, 1, 0, 0};
    static int[]           dc = {0, 0, -1, 1};
    static int[][]         field;
    static int[][]         dp;
    
    static int DFS(int row, int col) {
        if (row == rowOfField - 1 && col == colOfField - 1) {
            return 1;
        }
        
        if (dp[row][col] != -1) {
            return dp[row][col];
        }
        
        dp[row][col] = 0;
        for (int dir = 0; dir < 4; dir++) {
            int nextRow = row + dr[dir];
            int nextCol = col + dc[dir];
            
            if (nextRow < 0 || nextCol < 0 || nextRow >= rowOfField || nextCol >= colOfField) {
                continue;
            }
            
            if (field[row][col] <= field[nextRow][nextCol]) {
                continue;
            }
            
            dp[row][col] += DFS(nextRow, nextCol);
        }
        return dp[row][col];
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st         = new StringTokenizer(br.readLine());
        rowOfField = Integer.parseInt(st.nextToken());
        colOfField = Integer.parseInt(st.nextToken());
        field      = new int[rowOfField][colOfField];
        for (int row = 0; row < rowOfField; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < colOfField; col++) {
                field[row][col] = Integer.parseInt(st.nextToken());
            }
        }
        
        // solve
        dp = new int[rowOfField][colOfField];
        for (int row = 0; row < rowOfField; row++) {
            Arrays.fill(dp[row], -1);
        }
        
        count = DFS(0, 0);
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}
