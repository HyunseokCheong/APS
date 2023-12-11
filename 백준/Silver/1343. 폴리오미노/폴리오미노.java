import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static final String A = "AAAA", B = "BB";
    static String line;
    
    static void input() throws IOException {
        line = br.readLine();
    }
    
    static void process() throws IOException {
        line = line.replace("XXXX", A);
        line = line.replace("XX", B);
        if (line.contains("X")) {
            bw.write(-1 + "\n");
        }
        if (!line.contains("X")) {
            bw.write(line + "\n");
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