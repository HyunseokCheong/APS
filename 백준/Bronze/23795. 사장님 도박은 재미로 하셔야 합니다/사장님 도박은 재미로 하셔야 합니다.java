/**
 * -1 나올 때 까지 전부 더한다
 *
 * @author hyunseokcheong
 * @Date 2023/01/07
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int input;
    static int sum;
    
    public static void main(String[] args) throws IOException {
        // read
        while (true) {
            input = Integer.parseInt(br.readLine());
            if (input == -1) {
                break;
            }
            sum += input;
        }
        // solve
        bw.write(sum + "\n");
        
        // write
        bw.flush();
        bw.close();
    }
}