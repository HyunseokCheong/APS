import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int X;
    static int Y;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        for (int i = 1; i < N; i++) {
            Y = Integer.parseInt(st.nextToken());
            bw.write(solve(X, Y) + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static String solve(int X, int Y) {
        int gcd = GCD(X, Y);
        return (X / gcd) + "/" + (Y / gcd);
    }
    
    static int GCD(int X, int Y) {
        if (Y == 0) {
            return X;
        }
        return GCD(Y, X % Y);
    }
}