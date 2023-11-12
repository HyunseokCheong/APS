import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static boolean[] submit;
    
    static void input() throws IOException {
        submit = new boolean[31];
        for (int i = 0; i < 28; i++) {
            submit[Integer.parseInt(br.readLine())] = true;
        }
    }
    
    static void process() throws IOException {
        for (int i = 1; i < 31; i++) {
            if (!submit[i]) {
                bw.write(i + "\n");
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