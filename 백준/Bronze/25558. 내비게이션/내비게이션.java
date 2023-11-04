import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static long[] start, end;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        start = new long[2];
        end = new long[2];
        st = new StringTokenizer(br.readLine());
        start[0] = Long.parseLong(st.nextToken());
        start[1] = Long.parseLong(st.nextToken());
        end[0] = Long.parseLong(st.nextToken());
        end[1] = Long.parseLong(st.nextToken());
    }
    
    static void process() throws IOException {
        long minDist = Long.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());
            long dist = 0;
            long[] pre = start;
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                long[] cur = new long[]{Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken())};
                dist += Math.abs(cur[0] - pre[0]) + Math.abs(cur[1] - pre[1]);
                pre = cur;
            }
            dist += Math.abs(end[0] - pre[0]) + Math.abs(end[1] - pre[1]);
            if (dist < minDist) {
                minDist = dist;
                minIdx = i + 1;
            }
        }
        bw.write(minIdx + "\n");
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