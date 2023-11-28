import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String input;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        input = br.readLine();
    }
    
    static void process() throws IOException {
        String result = "";
        for (int i = n - 5; i < n; i++) {
            result += input.charAt(i);
        }
        bw.write(result + "\n");
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