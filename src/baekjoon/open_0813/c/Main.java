package baekjoon.open_0813.c;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        int q, x, w;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            q = Integer.parseInt(st.nextToken());
            if (q == 1) {
                x = Integer.parseInt(st.nextToken());
                w = Integer.parseInt(st.nextToken());
                map.put(w, x);
            } else if (q == 2) {
                w = Integer.parseInt(st.nextToken());
                bw.write(map.get(w) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
