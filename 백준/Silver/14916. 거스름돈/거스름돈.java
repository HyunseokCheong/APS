import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static final int TWO = 2, FIVE = 5;
    static int result;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        result = 0;
        while (true) {
            if (n % FIVE == 0) {
                result += n / FIVE;
                bw.write(result + "\n");
                return;
            }
            n -= TWO;
            result++;
            
            if (n < 0) {
                bw.write(-1 + "\n");
                return;
            }
        }
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}