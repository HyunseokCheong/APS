import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = 1000 - Integer.parseInt(br.readLine()); // 1 ~ 999
        // 500 100 50 10 5 1
        int count = 0;
        while (n > 0) {
            if (n >= 500) {
                n -= 500;
                count++;
                continue;
            }
            if (n >= 100) {
                n -= 100;
                count++;
                continue;
            }
            if (n >= 50) {
                n -= 50;
                count++;
                continue;
            }
            if (n >= 10) {
                n -= 10;
                count++;
                continue;
            }
            if (n >= 5) {
                n -= 5;
                count++;
                continue;
            }
            n -= 1;
            count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}