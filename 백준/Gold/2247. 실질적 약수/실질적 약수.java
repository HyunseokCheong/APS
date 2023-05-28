/**
 * SOD(N)은 1과 N을 제외한 N의 약수들
 * CSOD(N)은 SOD(1) + ... + SOD(N)
 * 1 <= N <= 200,000,000
 * CSOD(N)를 1,000,000으로 나눈 나머지
 * 1. 1을 약수로 갖는 경우 = N - 1
 * 2. 2를 실질적 약수로 갖는 경우 = N // 2 - 1
 * ...
 *
 * @Author HyunseokCheong
 * @Date 2023-01-27
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
    static long answer;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        answer = 0;
        for (long i = 2; i <= N / 2; i++) {
            answer += i * (N / i - 1);
        }
        answer %= 1000000;
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}