/**
 * i 번째에 손을 바꾼다
 * -> i 이전에 가장 많이 이길 수 있으면서 i 이후에 사장 많이 이길 수 있는 거
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    // declare
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int            N;
    static String[]       arr;
    static int[]          H, P, S;
    static int maxVal, maxLeft, maxRight;
    
    public static void main(String[] args) throws IOException {
        // read
        N   = Integer.parseInt(br.readLine());
        arr = new String[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = br.readLine();
        }
        
        // solve
        H = new int[N + 1];
        P = new int[N + 1];
        S = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            if (arr[i].equals("H")) {
                H[i]++;
            } else if (arr[i].equals("P")) {
                P[i]++;
            } else if (arr[i].equals("S")) {
                S[i]++;
            }
            H[i] += H[i - 1];
            P[i] += P[i - 1];
            S[i] += S[i - 1];
        }
        maxVal = Math.max(H[N], Math.max(P[N], S[N]));
        
        for (int i = 1; i < N + 1; i++) {
            maxLeft  = Math.max(H[i], Math.max(P[i], S[i]));
            maxRight = Math.max(H[N] - H[i], Math.max(P[N] - P[i], S[N] - S[i]));
            maxVal = Math.max(maxVal, maxLeft + maxRight);
        }
        
        // write
        bw.write(maxVal + "");
        bw.flush();
        bw.close();
    }
}