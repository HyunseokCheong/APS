package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_29163 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, num, odd, even;
    static String answer;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        odd = 0;
        even = 0;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0) {
                even++;
                continue;
            }
            odd++;
        }
        if (even > odd) {
            answer = "Happy";
        } else {
            answer = "Sad";
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}
