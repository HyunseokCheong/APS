import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N, Q;
    static int num;
    static int X1, Y1, X2, Y2;
    static int       count;
    static int[]     arr;
    static int[][][] board;
    
    public static void main(String[] args) throws IOException {
        // read
        N     = Integer.parseInt(br.readLine());
        board = new int[N + 1][N + 1][11];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                num = Integer.parseInt(st.nextToken());
                for (int k = 1; k <= 10; k++) {
                    board[i][j][k] = board[i - 1][j][k] + board[i][j - 1][k] - board[i - 1][j - 1][k];
                }
                board[i][j][num]++;
            }
        }
        
        // solve
        Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            X1 = Integer.parseInt(st.nextToken());
            Y1 = Integer.parseInt(st.nextToken());
            X2 = Integer.parseInt(st.nextToken());
            Y2 = Integer.parseInt(st.nextToken());
            
            arr   = new int[11];
            count = 0;
            for (int j = 1; j <= 10; j++) {
                arr[j] = board[X2][Y2][j];
            }
            for (int j = 1; j <= 10; j++) {
                arr[j] = arr[j] - board[X2][Y1 - 1][j] - board[X1 - 1][Y2][j] + board[X1 - 1][Y1 - 1][j];
            }
            
            for (int j = 1; j <= 10; j++) {
                if (arr[j] > 0) {
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}