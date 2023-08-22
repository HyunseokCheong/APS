import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int answer = 0;
        for (int r = 0; r < 8; r++) {
            char[] input = br.readLine().toCharArray();
            for (int c = 0; c < 8; c++) {
                if ((r + c) % 2 == 0 && input[c] == 'F') {
                    answer++;
                }
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}