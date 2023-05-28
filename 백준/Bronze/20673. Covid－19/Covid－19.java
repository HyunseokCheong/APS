import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    static BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));
    static String         endl = "\n";
    static int            N;
    static int            M;
    static String         color;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        if (50 >= N && 10 >= M) {
            color = "White";
        } else if (30 < M) {
            color = "Red";
        } else {
            color = "Yellow";
        }
        
        bw.write(color);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}