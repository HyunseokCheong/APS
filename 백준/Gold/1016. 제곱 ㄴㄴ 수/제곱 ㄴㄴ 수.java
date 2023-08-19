import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static long min;
    static long max;
    static int count;
    
    static void input() throws IOException {
        stk();
        min = Long.parseLong(st.nextToken());
        max = Long.parseLong(st.nextToken());
    }
    
    static void solve() throws IOException {
        int result = (int) (max - min + 1);
        int sqrt = ((int) Math.sqrt(max));
        
        boolean[] check = new boolean[result];
        
        for (long i = 2; i <= sqrt; i++) {
            long square = i * i;
            long start;
            if (min % square == 0) {
                start = min / square;
            } else {
                start = min / square + 1;
            }
            
            for (long j = start; j * square <= max; j++) {
                check[(int) ((j * square) - min)] = true;
            }
        }
        
        count = 0;
        for (int i = 0; i < result; i++) {
            if (check[i]) {
                continue;
            }
            count++;
        }
        
        bw.write(count + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}