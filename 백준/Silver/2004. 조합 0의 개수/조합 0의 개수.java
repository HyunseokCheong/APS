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
    static long N, M;
    static long count5, count2;
    static long count;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
        
        // solve
        count5 = five(N) - five(N - M) - five(M);
        count2 = two(N) - two(N - M) - two(M);
        count = Math.min(count5, count2);
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
    
    static long five(long X) {
        count = 0;
        while (X >= 5) {
            count += (X / 5);
            X /= 5;
        }
        return count;
    }
    
    static long two(long X) {
        count = 0;
        while (X >= 2) {
            count += (X / 2);
            X /= 2;
        }
        return count;
    }
}