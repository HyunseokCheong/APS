import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             nextMonth;
    static int             remain;
    static int             need;
    
    static void input() throws IOException {
        nextMonth = Integer.parseInt(br.readLine());
        remain    = Integer.parseInt(br.readLine());
    }
    
    static int solve() {
        need = remain + 60 - nextMonth;
        
        if (need >= 0) {
            return nextMonth * 1500;
        }
        
        return (remain + 60) * 1500 + (nextMonth - remain - 60) * 3000;
    }
    
    static void process() throws IOException {
        bw.write(solve() + endl);
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