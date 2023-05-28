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
    static int     X1, Y1, X2, Y2;
    
    public static void main(String[] args) throws IOException {
        // read
        st  = new StringTokenizer(br.readLine());
        N   = Integer.parseInt(st.nextToken());
        M   = Integer.parseInt(st.nextToken());
        arr = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // solve
        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N; j++) {
                arr[i][j + 1] += arr[i][j];
            }
        }
        for (int j = 1; j < N + 1; j++) {
            for (int i = 1; i < N; i++) {
                arr[i + 1][j] += arr[i][j];
            }
        }
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            X1 = Integer.parseInt(st.nextToken());
            Y1 = Integer.parseInt(st.nextToken());
            X2 = Integer.parseInt(st.nextToken());
            Y2 = Integer.parseInt(st.nextToken());
            bw.write(arr[X2][Y2] - arr[X1 - 1][Y2] - arr[X2][Y1 - 1] + arr[X1 - 1][Y1 - 1] + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}