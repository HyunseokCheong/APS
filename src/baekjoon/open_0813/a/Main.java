package baekjoon.open_0813.a;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int x1 = H * I;
        int x2 = A * R * C;
        
        bw.write(x1 - x2 + "\n");
        bw.flush();
        bw.close();
    }
}
