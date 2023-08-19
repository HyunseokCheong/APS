import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int dir;
    
    static void solve() throws IOException {
        dir = 0;
        int[] q = new int[]{1, 2, 3};
        for (int i = 0; i < 10; i++) {
            dir += q[Integer.parseInt(br.readLine()) - 1];
        }
        char[] result = new char[]{'N', 'E', 'S', 'W'};
        bw.write(result[dir % 4] + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}