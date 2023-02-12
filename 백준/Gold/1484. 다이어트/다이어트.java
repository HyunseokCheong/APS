import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    // declare
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int            N;
    static long           start, end, squareStart, squareEnd;
    
    static boolean flag;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        start = 1;
        end   = 2;
        flag  = false;
        
        while (end <= 100000) {
            squareStart = start * start;
            squareEnd   = end * end;
            
            if (squareEnd - squareStart == N) {
                bw.write(end + "\n");
                flag = true;
            }
            
            if (squareEnd - squareStart > N) {
                start++;
            } else {
                end++;
            }
        }
        
        // write
        if (!flag) {
            bw.write(-1 + "");
        }
        bw.flush();
        bw.close();
    }
}