/**
 * GCD, LCM
 * X, Y
 * 1. GCD * LCM = X * Y
 * 2. try catch
 * * Exception e -> e.getMessage()
 * 3. 정답 후보 : GCD(i, XY/i) => GCD 인 숫자 쌍
 * * 중에서 합이 최소가 되는 경우
 *
 * @Author HyunseokCheong
 * @Date 2023-01-20
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
    static long GCD, LCM;
    static long XY, temp1, temp2, answer1, answer2;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        GCD = Long.parseLong(st.nextToken());
        LCM = Long.parseLong(st.nextToken());
        
        // solve
        XY = GCD * LCM;
        try {
            answer1 = GCD;
            answer2 = LCM;
            for (long i = 2 * GCD; i * i < XY; i += GCD) {
                if (XY % i == 0) {
                    temp1 = i;
                    temp2 = XY / i;
                    if (gcd(i, XY / i) == GCD) {
                        if (temp1 + temp2 < answer1 + answer2) {
                            answer1 = temp1;
                            answer2 = temp2;
                        }
                    }
                }
            }
            // write
            bw.write(answer1 + " " + answer2 + "");
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    private static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}