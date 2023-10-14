import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, total, brother, result1, result2;
    
    static void input() throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            total = Integer.parseInt(st.nextToken());
            brother = Integer.parseInt(st.nextToken());
            process();
        }
    }
    
    static void process() throws IOException {
        result1 = total / brother;
        result2 = total % brother;
        bw.write("You get " + result1 + " piece(s) and your dad gets " + result2 + " piece(s)." + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}