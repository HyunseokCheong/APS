import java.io.*;
import java.util.Arrays;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int target;
    static int N;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        String input;
        while ((input = br.readLine()) != null) {
            target = Integer.parseInt(input) * 10000000;
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            
            Arrays.sort(arr);
            int left = 0;
            int right = N - 1;
            boolean flag = false;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    flag = true;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            if (flag) {
                System.out.println("yes " + arr[left] + " " + arr[right]);
            } else {
                System.out.println("danger");
            }
        }
    }
}