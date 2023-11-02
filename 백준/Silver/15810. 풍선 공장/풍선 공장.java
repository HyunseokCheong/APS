import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    static long min;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(min, arr[i]);
        }
    }
    
    static void process() throws IOException {
        long l = 0, r = min * m;
        while (l + 1 < r) {
            long mid = (l + r) / 2;
            long balloon = 0;
            for (int i = 0; i < n; i++) {
                balloon += mid / arr[i];
            }
            
            if (balloon >= m) {
                r = mid;
                continue;
            }
            l = mid;
        }
        bw.write(r + "\n");
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