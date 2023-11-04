import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b, c, aa, bb, cc, t, sum;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    aa = a - i;
                    bb = b - j;
                    cc = c - k;
                    t = Math.max(Math.max(aa, bb), cc);
                    sum = aa + bb + cc;
                    if (sum - t > t && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        bw.write(max + "\n");
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