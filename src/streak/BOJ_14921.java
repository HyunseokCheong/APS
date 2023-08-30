package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_14921 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int left = 0;
        int right = n - 1;
        int minValue = Integer.MAX_VALUE;
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            minValue = Math.abs(minValue) > Math.abs(sum) ? sum : minValue;
            
            if (sum == 0) {
                minValue = sum;
                break;
            }
            
            if (sum > 0) {
                right--;
                continue;
            }
            
            left++;
        }
        
        bw.write(minValue + "\n");
        bw.flush();
        bw.close();
    }
}
