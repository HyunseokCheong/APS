/**
 * 아침 : T <= 11
 * 점심 : 12 <= T <= 16
 * 저녁 : 17 <= T
 * 술 O : S = 1
 * 술 X : S = 0
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
    static int T; // 0 <= T <= 23
    static int S; // 0 <= S <= 1
    static int rice;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        
        // solve
        // 점심 + 술 X = 320
        if (T >= 12 && T <= 16 && S == 0) {
            rice = 320;
        } else {
            rice = 280;
        }
        
        // write
        bw.write(rice + "");
        bw.flush();
        bw.close();
    }
}