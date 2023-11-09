import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int d, h, w;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        d = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        double sqrt = Math.sqrt(Math.pow(d, 2) / (Math.pow(h, 2) + Math.pow(w, 2)));
        int sh = (int) Math.floor(sqrt * h);
        int sw = (int) Math.floor(sqrt * w);
        bw.write(sh + " " + sw + "\n");
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