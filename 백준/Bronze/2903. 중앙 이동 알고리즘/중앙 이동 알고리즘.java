import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        // (2 ** n + 1) ** 2
        bw.write((int) Math.pow(Math.pow(2, n) + 1, 2) + "\n");
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