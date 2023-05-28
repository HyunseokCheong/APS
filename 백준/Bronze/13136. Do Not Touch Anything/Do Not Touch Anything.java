import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int R, C, N;
    static long answerX, answerY;
    static long answer;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        // solve
        answerY = 0;
        answerX = 0;
        if (R % N == 0) {
            answerY += R / N;
        } else {
            answerY += R / N + 1;
        }
        if (C % N == 0) {
            answerX += C / N;
        } else {
            answerX += C / N + 1;
        }
        answer = answerX * answerY;
        
        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}