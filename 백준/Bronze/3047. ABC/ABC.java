import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b, c, t1, t2, t3;
    static String string;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        t1 = Integer.parseInt(st.nextToken());
        t2 = Integer.parseInt(st.nextToken());
        t3 = Integer.parseInt(st.nextToken());
        string = br.readLine();
    }
    
    static void process() throws IOException {
        a = Math.min(Math.min(t1, t2), t3);
        c = Math.max(Math.max(t1, t2), t3);
        b = t1 + t2 + t3 - a - c;
        for (char ch : string.toCharArray()) {
            if (ch == 'A') {
                bw.write(a + " ");
            }
            if (ch == 'B') {
                bw.write(b + " ");
            }
            if (ch == 'C') {
                bw.write(c + " ");
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