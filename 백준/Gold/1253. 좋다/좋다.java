import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static long[] arr;
    static int answer;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new long[n];
        stk();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
    }
    
    static void solve() throws IOException {
        answer = 0;
        for (int i = 0; i < n; i ++) {
            long num = arr[i];
            int left = 0;
            int right = n - 1;
            while (left != right) {
                if (i == left) {
                    left++;
                    continue;
                }
                if(i==right) {
                    right--;
                    continue;
                }
                long sum = arr[left] + arr[right];
                if (sum < num) {
                    left++;
                } else if (sum == num) {
                    answer++;
                    break;
                } else {
                    right--;
                }
            }
        }
        bw.write(answer + " ");
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