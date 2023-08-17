package strick.boj_3649;

import java.io.*;
import java.util.Arrays;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int target;
    static int N;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        // 0. 입력은 여러 개의 테스트 케이스로 이루어져 있다.
        String input;
        while ((input = br.readLine()) != null) {
            // 1. 입력
            target = Integer.parseInt(input) * 10000000;
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            
            // 2. 정렬 후 2개의 원소의 합이 타겟과 일치하는 지점을 찾는다.
            // 가장 먼저 찾은 지점이 두 원소의 차의 절대값이 가장 큰 지점이다.
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
