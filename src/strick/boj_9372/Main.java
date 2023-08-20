package strick.boj_9372;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int T;
    static int N;
    static int M;
    
    static void input() throws IOException {
        T = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
            }
            bw.write(N - 1 + "\n");
        }
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}
