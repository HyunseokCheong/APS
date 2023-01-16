/**
 * N 테케 (1 < N < 100)
 * M 정수의 개수 (1 < M < 100)
 * num 정수 (-2^31 < num < 2^31 -1) int 쓰믄댐
 * 1. 모든 두 수의 쌍을 만든다.
 * 2. 만들면서 두 수의 최대공약수를 구하고 최대 값인지 갱신해줌
 *
 * @Author HyunseokCheong
 * @Date 2023-01-16
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
    static ArrayList<Integer> arrayList;
    static int arrayListSize;
    static int curGCD, maxVal;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            arrayList = new ArrayList<>();
            
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            
            maxVal = Integer.MIN_VALUE;
            arrayListSize = arrayList.size();
            for (int i = 0; i < arrayListSize - 1; i++) {
                for (int j = i + 1; j < arrayListSize; j++) {
                    if (i == j) {
                        continue;
                    }
                    curGCD = gcd(arrayList.get(i), arrayList.get(j));
                    maxVal = Math.max(maxVal, curGCD);
                }
            }
            bw.write(maxVal + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}