import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static Set<String> set;
    static String string;
    static int result;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            string = br.readLine();
            set.add(string);
        }
        result = 0;
        for (int i = 0; i < m; i++) {
            string = br.readLine();
            if (set.contains(string)) {
                result++;
            }
        }
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