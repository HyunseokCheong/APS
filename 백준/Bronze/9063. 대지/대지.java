import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, r, c;
    static int maxR, minR, maxC, minC;
    static int result;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        maxR = maxC = Integer.MIN_VALUE;
        minR = minC = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            maxR = Math.max(maxR, r);
            maxC = Math.max(maxC, c);
            minR = Math.min(minR, r);
            minC = Math.min(minC, c);
        }
    }
    
    static void process() throws IOException {
        result = (maxR - minR) * (maxC - minC);
    }
    
    static void output() throws IOException {
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}