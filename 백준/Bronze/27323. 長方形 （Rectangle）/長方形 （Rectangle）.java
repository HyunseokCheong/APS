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
    static int A, B;
    
    public static void main(String[] args) throws IOException {
        // read
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        
        // solve
        bw.write(A * B + "");
        
        // write
        bw.flush();
        bw.close();
    }
}