import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             N;
    static int             M;
    static int             sum;
    static int             min;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
    }
    
    static boolean isSquare(int x) {
        double sqrt = Math.sqrt(x);
        return sqrt % 1 == 0;
    }
    
    static void process() throws IOException {
        sum = 0;
        min = Integer.MAX_VALUE;
        for (int i = N; i <= M; i++) {
            if (isSquare(i)) {
                sum += i;
                min = Math.min(min, i);
            }
        }
        
        if (sum == 0) {
            bw.write(-1 + endl);
        } else {
            bw.write(sum + endl + min + endl);
        }
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}