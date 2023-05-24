import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             X, Y;
    
    public static void main(String[] args) throws IOException {
        // read
        X = Integer.parseInt(br.readLine());
        Y = Integer.parseInt(br.readLine());
        
        // solve
        for (int i = X; i <= Y; i++) {
            if ((i - X) % 4 == 0 && (i - X) % 2 == 0 && (i - X) % 3 == 0 && (i - X) % 5 == 0) {
                bw.write("All positions change in year " + i + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}