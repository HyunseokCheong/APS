import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // declare
    static int A, B;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        
        // solve
        if (A < B) {
            answer = -1;
        } else if (A > B) {
            answer = 1;
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}