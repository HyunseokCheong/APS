import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             n;
    static int[]           dp;
    static int[]           sq;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        dp = new int[n + 1];
        sq = new int[316];
        for (int i = 1; i < 317; i++) {
            sq[i - 1] = i * i;
        }
        
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            li.clear();
            for (int num : sq) {
                if (num > i) {
                    break;
                }
                li.add(dp[i - num]);
            }
            dp[i] = Collections.min(li) + 1;
        }
        
        bw.write(dp[n] + endl);
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