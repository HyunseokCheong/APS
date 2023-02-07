import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N;
    static int             diff;
    static long            count;
    static int[]           arrA, arrB;
    static HashMap<Integer, Integer> hashMap;
    
    
    public static void main(String[] args) throws IOException {
        // read
        N    = Integer.parseInt(br.readLine());
        st   = new StringTokenizer(br.readLine());
        arrA = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken()) + arrA[i - 1];
        }
        st   = new StringTokenizer(br.readLine());
        arrB = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            arrB[i] = Integer.parseInt(st.nextToken()) + arrB[i - 1];
        }
        
        // solve
        count   = 0;
        hashMap = new HashMap<>();
        for (int i = 0; i <= N; i++) {
            diff = arrA[i] - arrB[i];
            count += hashMap.getOrDefault(diff, 0);
            hashMap.put(diff, hashMap.getOrDefault(diff, 0) + 1);
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}