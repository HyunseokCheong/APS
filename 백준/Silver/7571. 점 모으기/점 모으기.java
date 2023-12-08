import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] x, y;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = new int[m];
        y = new int[m];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        Arrays.sort(x);
        Arrays.sort(y);
        int xm = x[m / 2];
        int ym = y[m / 2];
        int res = 0;
        for (int i = 0; i < m; i++) {
            res += Math.abs(xm - x[i]) + Math.abs(ym - y[i]);
        }
        bw.write(res + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}