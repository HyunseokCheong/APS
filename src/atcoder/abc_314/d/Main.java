package atcoder.abc_314.d;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        
        Pair[] status = new Pair[N];
        for (int i = 0; i < N; i++) {
            status[i] = new Pair(0, S.charAt(i));
        }
        
        int Q = Integer.parseInt(br.readLine());
        Pair fill = null;
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            
            if (t == 1) {
                status[x - 1] = new Pair(i, c);
                continue;
            }
            fill = new Pair(i, t);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Pair p : status) {
            if (fill == null || p.time >= fill.time) {
                sb.append(p.character);
                continue;
            }
            if (fill.operation == 2) {
                sb.append(Character.toLowerCase(p.character));
                continue;
            }
            if (fill.operation == 3) {
                sb.append(Character.toUpperCase(p.character));
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
    }
    
    static class Pair {
        int time;
        char character;
        int operation;
        
        Pair(int time, char character) {
            this.time = time;
            this.character = character;
        }
        
        Pair(int time, int operation) {
            this.time = time;
            this.operation = operation;
        }
    }
}
