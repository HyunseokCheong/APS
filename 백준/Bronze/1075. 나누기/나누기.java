import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String n, sub;
    static int f;
    
    static void input() throws IOException {
        n = br.readLine();
        sub = n.substring(0, n.length() - 2);
        f = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        for (int i = 0; i < 100; i++) {
            if ((Integer.parseInt(sub) * 100 + i) % f == 0) {
                bw.write(String.format("%02d", i));
                break;
            }
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