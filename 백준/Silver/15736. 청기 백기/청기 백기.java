/**
 * 제곱수 찾는 문제
 * N 보다 작거나 같은 가장 큰 제곱수 찾기
 *
 * @Author HyunseokCheong
 * @Date 2023-01-19
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
    static long N;
    static long answer;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Long.parseLong(br.readLine());
        
        // solve
        while (true) {
            if ((long) Math.sqrt(N) * (long) Math.sqrt(N) == N) {
                answer = (long) Math.sqrt(N);
                break;
            } else {
                N--;
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}