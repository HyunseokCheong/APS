/**
 * N : 인명구조원(1 <= N <= 100)
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
    static int N;
    static int start, end;
    static int time, maxTime;
    static int[] timeLine;
    static int[][] worker;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        worker = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            worker[i][0] = start;
            worker[i][1] = end;
        }
        
        // solve
        maxTime = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            // i 인덱스 직원이 해고된 상황
            time = 0;
            timeLine = new int[1001];
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                
                start = worker[j][0];
                end = worker[j][1];
                for (int k = start; k < end; k++) {
                    if (timeLine[k] == 0) {
                        timeLine[k] = 1;
                        time++;
                    }
                }
                maxTime = Math.max(maxTime, time);
            }
        }
        
        // write
        bw.write(maxTime + "");
        bw.flush();
        bw.close();
    }
}