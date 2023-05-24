/**
 * N (1 <= N <= 1,000,000)
 * 1,000,000개 짜리 정수배열 미리 만들어 둔다.
 * 0이 나오면 종료
 *
 * @Author HyunseokCheong
 * @Date 2023-01-13
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int[] arr;
    static int count, number;
    static boolean[] check;
    static int N;
    
    public static void main(String[] args) throws IOException {
        // read
        arr = new int[1000001];
        count = 1;
        check = new boolean[10];
        
        // solve
        loop1:
        for (int i = 1; count <= 1000000; i++) {
            number = i;
            Arrays.fill(check, false);
            while (number != 0) {
                if (check[number % 10]) {
                    continue loop1;
                }
                check[number % 10] = true;
                number /= 10;
            }
            arr[count++] = i;
        }
        
        // write
        while (true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) {
                break;
            }
            bw.write(arr[N] + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}