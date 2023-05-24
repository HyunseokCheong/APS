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
    static int X;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        X = Integer.parseInt(br.readLine());
        
        // solve
        answer = X * 24;
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}