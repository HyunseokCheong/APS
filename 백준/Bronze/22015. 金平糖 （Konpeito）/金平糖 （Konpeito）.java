import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String endl = "\n";
    static String blank = " ";
    static int a;
    static int b;
    static int c;
    static int maxValue;
    static int sum;
    
    static void input() throws IOException {
        stk();
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        maxValue = Math.max(a, b);
        maxValue = Math.max(maxValue, c);
        sum = 0;
        
        sum += maxValue - a;
        sum += maxValue - b;
        sum += maxValue - c;
        
        bw.write(sum + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}