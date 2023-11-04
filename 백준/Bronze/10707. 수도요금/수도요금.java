import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int a, b, c, d, p;
    
    static void input() throws IOException {
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        p = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        long x = (long) p * a;
        long y = 0;
        if (p <= c) {
            y = b;
        } else {
            y = b;
            y += (long) d * (p - c);
        }
        bw.write(Math.min(x, y) + "\n");
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