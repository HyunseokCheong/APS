/*
 * n, m, k
 * 전체 카드 수 n
 * O 카드 수 m
 * X 카드 수 n - m
 * 뒷면 O 카드 수 k
 * 뒷면 X 카드 수 n - k
 */

import java.io.*;
import java.util.*;

public class Main {

    // declare
    static int n, m, k;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // read
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        // solve
        answer = Math.min(m, k) + Math.min(n - m, n - k);
        bw.write(answer + "\n");

        // print
        bw.flush();
        bw.close();
    }
}