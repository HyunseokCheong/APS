import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             N;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
    }
    
    static boolean prime(int number) {
        if (number < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    static void solve(int result, int N) throws IOException {
        if (N == 0) {
            if (prime(result)) {
                bw.write(result + endl);
            }
            return;
        }
        
        for (int i = 0; i < 10; i++) {
            int next = result * 10 + i;
            if (prime(next)) {
                solve(next, N - 1);
            }
        }
    }
    
    static void process() throws IOException {
        solve(0, N);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}