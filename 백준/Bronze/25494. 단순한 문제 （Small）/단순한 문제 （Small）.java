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
    static int T; // 1 <= T <= 100
    static int A, B, C; // 1 <= A, B, C <= 60
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        T = Integer.parseInt(br.readLine());
        while (T-- >0) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            
            // solve
            answer = 0;
            for (int a = 1; a <= A; a++) {
                for (int b = 1; b <= B; b++) {
                    for (int c = 1; c <= C; c++) {
                        if (a % b == b % c && b % c == c % a) {
                            answer++;
                        }
                    }
                }
            }
            bw.write(answer + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}