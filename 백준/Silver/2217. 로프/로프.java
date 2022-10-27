import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int mxv = (int) -1e9;
        for (int i = n - 1; i > -1; i--) {
            arr[i] = arr[i] * (n - i);
            if (arr[i] > mxv) {
                mxv = arr[i];
            }
        }
        System.out.println(mxv);
    }
}