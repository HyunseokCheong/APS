import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long L, R, U, D;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        L = Long.MAX_VALUE;
        R = Long.MIN_VALUE;
        D = Long.MAX_VALUE;
        U = Long.MIN_VALUE;
        int row, col;
        String dir;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            col = Integer.parseInt(st.nextToken());
            row = Integer.parseInt(st.nextToken());
            dir = st.nextToken();
            switch (dir) {
                case "L":
                    L = Math.min(L, col);
                    break;
                case "R":
                    R = Math.max(R, col);
                    break;
                case "D":
                    D = Math.min(D, row);
                    break;
                case "U":
                    U = Math.max(U, row);
                    break;
            }
        }
        if (L == Long.MAX_VALUE || R == Long.MIN_VALUE || D == Long.MAX_VALUE || U == Long.MIN_VALUE) {
            bw.write("Infinity" + "\n");
            return;
        }
        bw.write((Math.abs(R - L) - 1) * (Math.abs(U - D) - 1) + "\n");
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