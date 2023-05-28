/**
 * 기울기로 생각하고
 * 분모와 분자의 최대공약수가 1일때 ++
 *
 * @Author HyunseokCheong
 * @Date 2023-01-27
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int C;
    static int N;
    static int[] arr;
    
    static int GCD(int A, int B) {
        return B == 0 ? A : GCD(B, A % B);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        C = Integer.parseInt(br.readLine());
        
        arr = new int[1002];
        for (int i = 0; i < 1001; i++, arr[i] = arr[i - 1]) {
            for (int j = 0; j < i; j++) {
                if (GCD(i, j) == 1) {
                    arr[i] += 2;
                }
            }
        }
        
        while (C-- > 0) {
            N = Integer.parseInt(br.readLine());
            bw.write(arr[N] + 1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}