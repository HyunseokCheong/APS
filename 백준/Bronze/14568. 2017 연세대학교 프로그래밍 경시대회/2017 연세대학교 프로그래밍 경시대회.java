/*
 * N 사탕 개수 (1 <= N <= 100)
 * A 남규
 * B 영훈
 * C 택희
 * A = B + 2
 * A, B, C != 0
 * B % 2 = 0
 *
 * 3중 for문
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // declare
    static int N;
    static int count;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        count = 0;
        for (int c = 1; c < N; c++) { // 택희
            for (int b = 1; b < N; b++) { // 영훈
                for (int a = 1; a < N; a++) { // 남규
                    
                    // 사탕이 100개 이하임
                    if (c + b + a > 100) {
                        continue;
                    }
                    
                    // 택희가 받은 사탕이 홀수임
                    if (c % 2 != 0) {
                        continue;
                    }
                    
                    // 남규 != 영훈 + 2
                    if (a < b + 2) {
                        continue;
                    }
                    
                    if (a + b + c == N) {
                        count++;
                    }
                }
            }
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}