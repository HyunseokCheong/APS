import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static boolean[] primes;
    static int a, b;
    
    static void solve() throws IOException {
        isPrime(b);
        for (int i = a; i < b + 1; i++) {
            if (primes[i] && isPalindrome(i)) {
                bw.write(i + "\n");
            }
        }
        bw.write(-1 + "\n");
    }
    
    static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    static void isPrime(int n) {
        primes = new boolean[n + 1];
        for (int i = 0; i < n + 1; i++) {
            primes[i] = true;
        }
        primes[0] = primes[1] = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        solve();
        bw.flush();
        bw.close();
    }
}