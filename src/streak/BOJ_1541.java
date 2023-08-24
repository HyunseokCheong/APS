package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1541 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int sum = Integer.MAX_VALUE;
        st = new StringTokenizer(br.readLine(), "-");
        while (st.hasMoreTokens()) {
            int cur = 0;
            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            
            while (st2.hasMoreTokens()) {
                cur += Integer.parseInt(st2.nextToken());
            }
            
            if (sum == Integer.MAX_VALUE) {
                sum = cur;
            } else {
                sum -= cur;
            }
        }
        
        bw.write(sum + "\n");
        bw.flush();
        bw.close();
    }
}
