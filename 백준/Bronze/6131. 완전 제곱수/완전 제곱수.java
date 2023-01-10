/*
 * A^2 = B^2 + N
 * 1 <= N <= 1,000
 *
 * 10000 * 10000 완전탐색
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int count;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        count = 0;
        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < 10000; j++) {
                if (i * i == j * j + N) {
                    count++;
                }
            }
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}