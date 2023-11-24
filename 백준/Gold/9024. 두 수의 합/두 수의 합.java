import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t, n, k;
    static int[] arr;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void solve() throws IOException {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int temp = Integer.MAX_VALUE;
        int count = 1;
        
        while (true) {
            int sum = arr[left] + arr[right];
            if (Math.abs(sum - k) == temp) {
                count++;
            }
            if (Math.abs(sum - k) < temp) {
                count = 1;
                temp = Math.abs(sum - k);
            }
            if (sum == k) {
                left++;
                right--;
            }
            if (sum < k) {
                left++;
            }
            if (sum > k) {
                right--;
            }
            if (left >= right) {
                break;
            }
        }
        
        bw.write(count + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            input();
            solve();
        }
        bw.flush();
        bw.close();
    }
}