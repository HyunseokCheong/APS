/**
 * N : 색종이 수 (N <= 100), paper : 100 * 100
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
    static int X, Y;
    static int[][] paper;
    static int area;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        paper = new int[101][101];
        area = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            
            for (int x = X; x < X + 10; x++) {
                for (int y = Y; y < Y + 10; y++) {
                    if (paper[x][y] == 0) {
                        paper[x][y] = 1;
                        area++;
                    }
                }
            }
        }
        
        // write
        bw.write(area + "");
        bw.flush();
        bw.close();
    }
}