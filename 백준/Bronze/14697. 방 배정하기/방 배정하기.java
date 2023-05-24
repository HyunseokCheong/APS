/**
 * 세가지 방 종류(1 <= A < B < C <= 50), 전체 학생 수(1 <= N <= 300), 완탐
 *
 * @Author HyunseokCheong
 * @Date 2023-01-11
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int A, B, C, N;
    static boolean check;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        
        // solve
        check = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; i++) {
                for (int k = 0; k < N - i - j; k++) {
                    if (A * i + B * j + C * k == N) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
            if (check) {
                break;
            }
        }
        
        // write
        if (check) {
            bw.write(1 + "");
        } else {
            bw.write(0 + "");
        }
        bw.flush();
        bw.close();
    }
}