import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N, M, result, left, right, mid, count;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M  = Integer.parseInt(st.nextToken());
        N  = Integer.parseInt(st.nextToken());
        
        arr = new int[N];
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        result = 0;
        left   = 1;
        right  = arr[N - 1];
        
        while (left <= right) {
            mid   = (left + right) / 2;
            count = 0;
            
            for (int i = 0; i < N; i++) {
                if (arr[i] >= mid) {
                    count += arr[i] / mid;
                }
            }
            
            if (count >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        bw.write(right + "");
        bw.flush();
        bw.close();
    }
}