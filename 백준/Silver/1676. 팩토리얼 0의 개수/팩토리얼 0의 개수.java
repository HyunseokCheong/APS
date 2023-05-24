/**
 * 5가 힌트임
 *
 * @Author HyunseokCheong
 * @Date 2023/01/21
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        answer = 0;
        while (N >= 5) {
            answer += N / 5;
            N /= 5;
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}