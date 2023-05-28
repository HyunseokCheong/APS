import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static long A, D, Q, T, L, R;
    static long temp1, temp2, answer;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        D = Long.parseLong(st.nextToken());
        Q = Long.parseLong(br.readLine());
        
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            T = Long.parseLong(st.nextToken());
            L = Long.parseLong(st.nextToken());
            R = Long.parseLong(st.nextToken());
            
            // solve
            answer = 0;
            if (T == 1) {
                temp1 = R * (2 * A + (R - 1) * D) / 2;
                temp2 = (L - 1) * (2 * A + (L - 2) * D) / 2;
                answer = temp1 - temp2;
            } else {
                if (L == R) {
                    answer = A + (L - 1) * D;
                } else {
                    answer = GCD(A, D);
                }
            }
            bw.write(answer + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
    
    static long GCD(long a, long b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}