/**
 * 에라토스테네의 체로 1,000,000 까지의 소수 배열을 만든다.
 * 입력받은 숫자의 소수 여부를 판별한다.
 * N = long
 *
 * @Author HyunseokCheong
 * @Date 2023/01/15
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static long S;
    static ArrayList<Integer> prime;
    static boolean[] check;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        prime = makePrime();
        for (int i = 0; i < N; i++) {
            S = Long.parseLong(br.readLine());
            if (checkPrime(S)) {
                bw.write("YES" + "\n");
            } else {
                bw.write("NO" + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
    
    /**
     * 1,000,000 이하의 소수들을 저장
     *
     * @return primeArrayList
     */
    static ArrayList<Integer> makePrime() {
        prime = new ArrayList<>();
        check = new boolean[1000001];
        for (int i = 2; i < 1000001; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = i + i; j < 1000001; j += j) {
                check[j] = true;
            }
        }
        for (int i = 2; i < 1000001; i++) {
            if (!check[i]) {
                prime.add(i);
            }
        }
        return prime;
    }
    
    /**
     * 1,000,000 이하의 소수들로 나누어 떨어지는지
     * 나누어 떨어짐(소수가 아님) = false
     * 나누어 떨어지지 않음(소수임) = true
     *
     * @param x
     * @return checkPrime
     */
    static boolean checkPrime(long x) {
        for (int p : prime) {
            if (x % (long) p == 0) {
                return false;
            }
        }
        return true;
    }
}