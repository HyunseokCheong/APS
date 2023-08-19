package atcoder.abc_314.a;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        String PI = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
        int N = Integer.parseInt(br.readLine());
        bw.write(PI.substring(0, N + 2) + "\n");
        bw.flush();
        bw.close();
    }
}
