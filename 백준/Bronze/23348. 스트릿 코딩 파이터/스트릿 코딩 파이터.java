import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int a, b, c;
    static int n;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                cur += Integer.parseInt(st.nextToken()) * a;
                cur += Integer.parseInt(st.nextToken()) * b;
                cur += Integer.parseInt(st.nextToken()) * c;
            }
            result = Math.max(result, cur);
        }
        bw.write(result + "\n");
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