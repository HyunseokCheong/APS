import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int target;
    static int m;
    static boolean[] broken = new boolean[10];
    
    static void input() throws IOException {
        target = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        if (m == 0) {
            return;
        }
        stk();
        for (int i = 0; i < m; i++) {
            broken[Integer.parseInt(st.nextToken())] = true;
        }
    }
    
    static void solve() throws IOException {
        int count = Math.abs(target - 100);
        for (int i = 0; i <= 1000001; i++) {
            String s = String.valueOf(i);
            int length = s.length();
            boolean flag = false;
            
            for (int j = 0; j < length; j++) {
                if (broken[s.charAt(j) - '0']) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                count = Math.min(Math.abs(target - i) + length, count);
            }
        }
        bw.write(count + "\n");
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