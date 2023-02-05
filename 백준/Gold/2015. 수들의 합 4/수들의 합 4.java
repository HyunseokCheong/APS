import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N, K;
    static Map<Integer, Long> map = new HashMap<>();
    static int[]              arr;
    static long               answer, diff;
    
    public static void main(String[] args) throws IOException {
        // read
        st  = new StringTokenizer(br.readLine());
        N   = Integer.parseInt(st.nextToken());
        K   = Integer.parseInt(st.nextToken());
        arr = new int[N + 1];
        
        // solve
        answer = 0;
        st     = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
            if (arr[i] == K) {
                answer += 1;
            }
            
            if (map.containsKey(arr[i] - K)) {
                answer += map.get(arr[i] - K);
            }
            
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1L);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}