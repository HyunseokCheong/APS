import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String input;
    static int count;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        count = 0;
        for (int i = 0; i < n; i++) {
            if (check(br.readLine())) {
                count++;
            }
        }
        bw.write(count + "\n");
    }
    
    static boolean check(String s) {
        char[] arr = s.toCharArray();
        boolean[] used = new boolean[26];
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (used[c - 97]) {
                continue;
            }
            used[c - 97] = true;
            int cnt = 0;
            for (char c1 : arr) {
                if (c == c1) {
                    cnt++;
                }
            }
            
            for (int j = i; j < i + cnt; j++) {
                if (arr[j] != c) {
                    return false;
                }
            }
        }
        return true;
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