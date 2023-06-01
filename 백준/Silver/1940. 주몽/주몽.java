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
    static int             N;
    static int             M;
    static int[]           arr;
    static int             answer;
    
    static void input() throws IOException {
        N   = Integer.parseInt(br.readLine());
        M   = Integer.parseInt(br.readLine());
        arr = new int[N];
        stk();
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        answer = 0;
        // 완탐 코드
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i == j) {
                    continue;
                }
                
                if (arr[i] + arr[j] == M) {
                    answer++;
                }
            }
        }
        bw.write(answer + endl);
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