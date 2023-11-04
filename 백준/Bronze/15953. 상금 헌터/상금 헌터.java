import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t, a, b, m;
    
    static int[] first = new int[]{500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10};
    static int[] second = new int[]{512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        m = 0;
        if (a > 0 && a <= 21) {
            m += first[a - 1];
        }
        if (b > 0 && b <= 31) {
            m += second[b - 1];
        }
        bw.write(m * 10000 + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input();
            process();
        }
        output();
    }
}