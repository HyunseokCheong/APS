import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int mxv = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i <= n - k; i++) {
            int res = 0;
            for (int j = i; j < i + k; j++) {
                res += arr[j];
            }
            mxv = Math.max(mxv, res);
        }
        System.out.println(mxv);
    }
}