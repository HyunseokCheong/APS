import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader      br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter      bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer     st;
    static int                 T; // target
    static int                 N; // arrA.length()
    static int                 M; // arrB.length()
    static HashMap<Long, Long> hashMap;
    static long[]              arrA, arrB;
    static long diff;
    static long temp;
    static long answer;
    
    public static void main(String[] args) throws IOException {
        // read
        T = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        
        // solve
        arrA = new long[N + 1];
        st   = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            arrA[i] = Long.parseLong(st.nextToken()) + arrA[i - 1];
        }
        
        M    = Integer.parseInt(br.readLine());
        arrB = new long[M + 1];
        st   = new StringTokenizer(br.readLine());
        for (int i = 1; i < M + 1; i++) {
            arrB[i] = Long.parseLong(st.nextToken()) + arrB[i - 1];
        }
        
        hashMap = new HashMap<>();
        answer  = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N + 1; j++) {
                temp = arrA[j] - arrA[i];
                diff = T - temp;
                
                if (hashMap.containsKey(diff)) {
                    hashMap.put(diff, hashMap.get(diff) + 1);
                } else {
                    hashMap.put(diff, 1L);
                }
            }
        }
        
        for (int i = 0; i < M; i++) {
            for (int j = i + 1; j < M + 1; j++) {
                temp = arrB[j] - arrB[i];
                
                if (hashMap.containsKey(temp)) {
                    answer += hashMap.get(temp);
                }
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}