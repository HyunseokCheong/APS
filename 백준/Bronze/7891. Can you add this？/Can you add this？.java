/**
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
    static int T;
    static long X, Y;
    
    public static void main(String[] args) throws IOException {
        // read
        T = Integer.parseInt(br.readLine());
        
        // solve
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            X = Long.parseLong(st.nextToken());
            Y = Long.parseLong(st.nextToken());
            bw.write(X + Y + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}