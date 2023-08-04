import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static long x, y, z;
    
    static void input() throws IOException {
        stk();
        x = Long.parseLong(st.nextToken());
        y = Long.parseLong(st.nextToken());
    }
    
    static void solve() throws IOException {
        z = y * 100 / x;
        if (z >= 99) {
            System.out.println(-1);
        } else {
            System.out.println(bs(1, x));
        }
    }
    
    static long bs(long start, long end) {
        long mid = 0;
        long ratio = 0;
        
        while (start <= end) {
            mid = (start + end) / 2;
            ratio = (y + mid) * 100 / (x + mid);
            
            if (ratio > z) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}