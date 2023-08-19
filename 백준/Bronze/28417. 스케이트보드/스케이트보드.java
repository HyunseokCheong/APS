import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] scores;
    static int curScore;
    static int maxScore;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        scores = new int[7];
        maxScore = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            curScore = 0;
            stk();
            for (int j = 0; j < 7; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }
            curScore += Math.max(scores[0], scores[1]);
            Arrays.sort(scores, 2, 7);
            curScore += scores[6] + scores[5];
            maxScore = Math.max(maxScore, curScore);
        }
        bw.write(maxScore + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}