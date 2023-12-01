import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String x, y;
    static int lengthX, lengthY, lcmXY;
    
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    static void input() throws IOException {
        x = br.readLine();
        y = br.readLine();
    }
    
    static void process() throws IOException {
        lengthX = x.length();
        lengthY = y.length();
        lcmXY = lcm(lengthX, lengthY);
        String tempX = "";
        for (int i = 0; i < lcmXY / lengthX; i++) {
            tempX += x;
        }
        String tempY = "";
        for (int i = 0; i < lcmXY / lengthY; i++) {
            tempY += y;
        }
        
        for (int i = 0; i < lcmXY; i++) {
            if (tempX.charAt(i) != tempY.charAt(i)) {
                bw.write(0 + "\n");
                return;
            }
        }
        bw.write(1 + "\n");
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