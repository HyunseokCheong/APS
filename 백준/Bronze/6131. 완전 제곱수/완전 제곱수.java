/*
 * A^2 = B^2 + N
 * 1 <= N <= 1,000
 *
 * 1 <= A, B <= 500
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
        for (int i = 1; i < 501; i++) {
            for (int j = 1; j < 501; j++) {
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