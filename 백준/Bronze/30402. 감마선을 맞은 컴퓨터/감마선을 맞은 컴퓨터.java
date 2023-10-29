import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static char[] input;
    
    static void input() throws IOException {
        int status = -1;
        for (int i = 0; i < 15; i++) {
            input = br.readLine().replace(" ", "").toCharArray();
            for (int j = 0; j < 15; j++) {
                if (input[j] == 'w') {
                    status = 0;
                }
                if (input[j] == 'g') {
                    status = 1;
                }
                if (input[j] == 'b') {
                    status = 2;
                }
            }
        }
        bw.write(status == 0 ? "chunbae" : status == 1 ? "yeongcheol" : "nabi");
        bw.write("\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}