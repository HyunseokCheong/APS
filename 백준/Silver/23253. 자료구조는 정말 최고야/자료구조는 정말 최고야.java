import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, c, p, num;
    static boolean flag;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        flag = true;
        for (int i = 0; i < m; i++) {
            c = Integer.parseInt(br.readLine());
            p = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < c; j++) {
                num = Integer.parseInt(st.nextToken());
                if (num > p) {
                    flag = false;
                }
                p = num;
            }
        }
        if (flag) {
            bw.write("Yes\n");
        } else {
            bw.write("No\n");
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