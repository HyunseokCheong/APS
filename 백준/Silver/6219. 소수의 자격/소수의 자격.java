/**
 * 소수배열 만들어놓고
 *
 * @Author HyunseokCheong
 * @Date 2023-01-18
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int A, B;
    static char D;
    static boolean[] isPrime;
    static boolean check;
    static int count;
    static String intToString;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        D = st.nextToken().charAt(0);
        
        // solve
        isPrime = new boolean[4000001];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < 4000001; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i + i; j < 4000001; j += i) {
                isPrime[j] = false;
            }
        }
        
        count = 0;
        for (int i = A; i <= B; i++) {
            if (!isPrime[i]) {
                continue;
            }
            intToString = Integer.toString(i);
            check = false;
            for (int j = 0; j < intToString.length(); j++) {
                if (intToString.charAt(j) == D) {
                    check = true;
                    break;
                }
            }
            if (check) {
                count++;
            }
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}