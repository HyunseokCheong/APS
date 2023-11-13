import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, m, M, T, R;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        int curPurse = m;
        if (curPurse + T > M) {
            bw.write(-1 + "\n");
            return;
        }
        int time = 0;
        int exerciseTime = 0;
        while (exerciseTime != N) {
            boolean canExercise = curPurse + T <= M;
            // T
            if (canExercise) {
                curPurse += T;
                exerciseTime++;
            }
            // R
            if (!canExercise) {
                curPurse = Math.max(curPurse - R, m);
            }
            time++;
        }
        bw.write(time + "\n");
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