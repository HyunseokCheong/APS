import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static double temp;
    
    static void input() throws IOException {
    
    }
    
    static void process() throws IOException {
        double curTemp = -11;
        while (true) {
            temp = Double.parseDouble(br.readLine());
            if (temp == 999) {
                break;
            }
            if (curTemp == -11) {
                curTemp = temp;
                continue;
            }
            bw.write(String.format("%.2f", (temp - curTemp)) + "\n");
            curTemp = temp;
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