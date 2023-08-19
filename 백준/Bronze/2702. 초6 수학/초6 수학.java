import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            bw.write(lcm(X, Y) + " " + gcd(X, Y) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static int gcd(int X, int Y) {
        if (Y == 0) {
            return X;
        }
        return gcd(Y, X % Y);
    }
    
    static int lcm(int X, int Y) {
        return X * Y / gcd(X, Y);
    }
}