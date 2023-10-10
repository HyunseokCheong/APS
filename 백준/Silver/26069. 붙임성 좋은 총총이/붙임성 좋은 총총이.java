import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static Set<String> dancer;
    static String a, b;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        dancer = new TreeSet<>();
    }
    
    static void process() throws IOException {
        dancer.add("ChongChong");
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            b = st.nextToken();
            if (dancer.contains(a) || dancer.contains(b)) {
                dancer.add(a);
                dancer.add(b);
            }
        }
        bw.write(dancer.size() + "\n");
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