/*
 * A : 양 한마리의 하루 먹는 사료 양 (1 <= A <= 1,000)
 * B : 염소 한마리의 하루 먹는 사료 양 (1 <= B <= 1,000)
 * N : 양과 염소 합친 전체 마리수 (2 <= N <= 1,000)
 * W : 양과 염소가 하루동안 먹은 사료 양 (2 <= W <= 1,000,000)
 *
 * X : 양 마리수
 * Y : 염소 마리수
 *
 * X = N - Y, Y = N - X
 * 1 ~ N 탐색
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int A, B, N, W, X, Y;
    static int count;
    static boolean flag;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        
        // solve
        count = 0;
        for (int i = 1; i < N; i++) {
            if (A * i + B * (N - i) == W) {
                if (count >= 2) {
                    System.out.println(-1);
                    return;
                }
                count++;
                X = i;
                Y = N - i;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(X + " " + Y);
        }
    }
}