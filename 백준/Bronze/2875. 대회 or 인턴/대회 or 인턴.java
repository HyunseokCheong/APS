/*
 * (0 ≤ M ≤ 100, 0 ≤ N ≤ 100, 0 ≤ K ≤ M+N),
 *
 * 100 * 100
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int girl, boy, intern;
    static int count, maxValue;
    
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        girl = Integer.parseInt(st.nextToken());
        boy = Integer.parseInt(st.nextToken());
        intern = Integer.parseInt(st.nextToken());
        
        // solve
        count = 0;
        maxValue = 0;
        
        for (int i = 0; i <= intern; i++) {
            count = Math.min((girl - i) / 2, (boy - (intern - i)));
            maxValue = Math.max(maxValue, count);
        }
        
        // write
        bw.write(maxValue + "");
        bw.flush();
        bw.close();
    }
}