import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase;
    static int change;
    static int c25;
    static int c10;
    static int c5;
    static int c1;
    
    static void input() throws IOException {
        testCase = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        for (int t = 0; t < testCase; t++) {
            change = Integer.parseInt(br.readLine());
            c25 = 0;
            c10 = 0;
            c5 = 0;
            c1 = 0;
            while (change >= 25) {
                change -= 25;
                c25++;
            }
            while (change >= 10) {
                change -= 10;
                c10++;
            }
            while (change >= 5) {
                change -= 5;
                c5++;
            }
            while (change >= 1) {
                change--;
                c1++;
            }
            bw.write(c25 + " " + c10 + " " + c5 + " " + c1 + "\n");
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