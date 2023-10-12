import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, number;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        while (true) {
            number = Integer.parseInt(br.readLine());
            if (number == 0) {
                return;
            }
            if (number % n == 0) {
                bw.write(isMultiple(number) + "\n");
                continue;
            }
            bw.write(isNotMultiple(number) + "\n");
        }
    }
    
    static String isMultiple(int x) {
        return x + " is a multiple of " + n + ".";
    }
    
    static String isNotMultiple(int x) {
        return x + " is NOT a multiple of " + n + ".";
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