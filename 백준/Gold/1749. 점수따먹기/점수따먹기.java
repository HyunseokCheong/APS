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
    static int             N, M;
    static int[][] arr;
    static long    maxArea, curArea;
    
    static long solve(int X1, int Y1, int X2, int Y2) {
        return arr[X2][Y2] - arr[X1 - 1][Y2] - arr[X2][Y1 - 1] + arr[X1 - 1][Y1 - 1];
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N  = Integer.parseInt(st.nextToken());
        M  = Integer.parseInt(st.nextToken());
        
        // solve
        arr = new int[N + 1][M + 1];
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < M + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken())
                        + arr[i - 1][j] + arr[i][j - 1] - arr[i - 1][j - 1];
            }
        }
        
        maxArea = Integer.MIN_VALUE;
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                for (int k = i; k < N + 1; k++) {
                    for (int l = j; l < M + 1; l++) {
                        curArea = solve(i,j,k,l);
                        maxArea = Math.max(maxArea, curArea);
                    }
                }
            }
        }
        
        // write
        bw.write(maxArea + "");
        bw.flush();
        bw.close();
    }
}