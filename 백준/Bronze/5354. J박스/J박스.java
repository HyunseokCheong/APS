import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t;
    static int n;
    
    static void input() throws IOException {
        t = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    for (int k = 0 ; k < n; k++) {
                        bw.write("#");
                    }
                    bw.newLine();
                    continue;
                }
                for (int k = 0; k < n; k++) {
                    if (k == 0 || k == n - 1) {
                        bw.write("#");
                        continue;
                    }
                    bw.write("J");
                }
                bw.newLine();
            }
            bw.newLine();
        }
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