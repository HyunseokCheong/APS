import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long[] x, y;
    static long resultA, resultB;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        x = new long[n + 1];
        y = new long[n + 1];
        resultA = 0;
        resultB = 0;
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        
        x[n] = x[0];
        y[n] = y[0];
        
        for (int i = 0; i < n; i++) {
            resultA += x[i] * y[i + 1];
            resultB += x[i + 1] * y[i];
        }
        
        bw.write(String.format("%.1f", Math.abs(resultA - resultB) / 2.0) + "\n");
        bw.flush();
        bw.close();
    }
}