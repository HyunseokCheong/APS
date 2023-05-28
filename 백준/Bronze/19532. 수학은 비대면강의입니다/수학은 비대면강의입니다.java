/**
 * AX + BY = C, DX + EY = F, (-999 <= A, B, C, D, E, F <= 999)
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
    static int A, B, C, D, E, F;
    static int X, Y;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());
        
        // solve
        X = 0;
        Y = 0;
        loop1:
        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if (A * x + B * y != C) {
                    continue;
                }
                if (D * x + E * y != F) {
                    continue;
                }
                X = x;
                Y = y;
                break loop1;
            }
        }
        bw.write(X + " " + Y + "");
        bw.flush();
        bw.close();
    }
}