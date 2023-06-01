/**
 * 1. N 소수 판별
 * 2. N 뒤집기
 * 3. 뒤집은 N 소수 판별
 *
 * @Author HyunseokCheong
 * @Date 2023-01-18
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // declare
    static long N;
    static long rotateN;
    static String longToString;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Long.parseLong(br.readLine());
        
        // solve
        if (!isPrime(N)) {
            System.out.println("no");
        } else {
            if (!isPrime(rotate(N))) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
    
    static boolean isPrime(long X) {
        if (X == 1) {
            return false;
        }
        for (long i = 2; i * i <= X; i++) {
            if (X % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static long rotate(long X) {
        rotateN = 0;
        longToString = Long.toString(X);
        for (int i = 0; i < longToString.length(); i++) {
            // 3 4 7
            if (longToString.charAt(i) == '3' || longToString.charAt(i) == '4' || longToString.charAt(i) == '7') {
                System.out.println("no");
                System.exit(0);
            }
            // 6 9
            if (longToString.charAt(i) == '6') {
                rotateN += (long) Math.pow(10, i) * 9;
                continue;
            }
            if (longToString.charAt(i) == '9') {
                rotateN += (long) Math.pow(10, i) * 6;
                continue;
            }
            // 0 1 2 5 8
            rotateN += (long) Math.pow(10, i) * (longToString.charAt(i) - '0');
        }
        return rotateN;
    }
}