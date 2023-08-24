package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_5073 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static String input;
    static int A, B, C;
    static String answer;
    
    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            if (A + B + C == 0) {
                break;
            }
            
            if (A + B <= C || B + C <= A || C + A <= B) {
                answer = "Invalid";
            } else {
                if (A == B && B == C) {
                    answer = "Equilateral";
                } else if (A == B || B == C || C == A) {
                    answer = "Isosceles";
                } else {
                    answer = "Scalene";
                }
            }
            
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
