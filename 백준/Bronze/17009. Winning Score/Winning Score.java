/**
 * A, B, T
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
    static int A, B;
    static String answer;
    
    public static void main(String[] args) throws IOException {
        // read
        A = Integer.parseInt(br.readLine()) * 3;
        A += Integer.parseInt(br.readLine()) * 2;
        A += Integer.parseInt(br.readLine());
        
        B = Integer.parseInt(br.readLine()) * 3;
        B += Integer.parseInt(br.readLine()) * 2;
        B += Integer.parseInt(br.readLine());
        
        // solve
        if (A > B) {
            answer = "A";
        } else if (A < B) {
            answer = "B";
        } else {
            answer = "T";
        }
        
        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}