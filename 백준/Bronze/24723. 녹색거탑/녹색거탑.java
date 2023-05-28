/*
 * 1    2 ** 1
 * 2    2 ** 2
 * 3    2 ** 3
 * 4    2 ** 4
 * 5    2 ** 5
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
    static int N; // 1 <= N <= 5
    static int answer;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        answer = (int) Math.pow(2, N);
        
        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}