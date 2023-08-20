package strick.boj_15668;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int N;
    static int number;
    static boolean[] used;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        number = 1;
        used = new boolean[10];
        while (Math.pow(10, number) < N) {
            number++;
        }
        while (number > 0) {
            BT(0, 0, 0);
            number--;
        }
        bw.write(-1 + "\n");
        bw.flush();
        bw.close();
    }
    
    static void BT(int depth, int sum1, int sum2) throws IOException {
        if (sum1 + sum2 > N) {
            return;
        }
        if (sum1 != 0 && sum2 != 0 && sum1 + sum2 == N) {
            bw.write(sum1 + " + " + sum2 + "\n");
            bw.flush();
            bw.close();
            System.exit(0);
        }
        if (depth == number) {
            BT(0, 0, sum1);
            return;
        }
        for (int i = 0; i < 10; i++) {
            if (!used[i] && (i != 0 || depth != 0)) {
                used[i] = true;
                BT(depth + 1, sum1 * 10 + i, sum2);
                used[i] = false;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}
