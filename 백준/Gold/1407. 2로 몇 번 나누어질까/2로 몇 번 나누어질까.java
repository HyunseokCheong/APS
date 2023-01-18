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
    static long A, B;
    static long answer;
    static long temp, count, i;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        
        // solve
        answer = 0;
        answer = solve(B) - solve(A - 1);
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
    
    static long solve(long X) {
        count = 0;
        i = 1;
        
        while (X > 0) {
            if (X % 2 == 0) {
                temp = X / 2;
            } else {
                temp = X / 2 + 1;
            }
            count += temp * i;
            X -= temp;
            i *= 2;
        }
        return count;
    }
}