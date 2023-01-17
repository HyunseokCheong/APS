import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int num;
    static boolean[] prime;
    static int count;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        count = 0;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }
        
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
    
    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}