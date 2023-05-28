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
    static int N; // 1 <= N <= 10000
    static int K; // 1 <= K <= N
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        
        // solve
        answer = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                K--;
            }
            if (K == 0) {
                answer = i;
                break;
            }
        }
        bw.write(answer + "");
        
        // write
        bw.flush();
        bw.close();
    }
}