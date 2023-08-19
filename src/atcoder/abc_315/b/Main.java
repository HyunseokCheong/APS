package atcoder.abc_315.b;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int M;
    static int[] arr;
    static int total;
    static int A;
    static int B;
    
    static void input() throws IOException {
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        total = 0;
        arr = new int[M];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }
        total = (total + 1) / 2;
    }
    
    static void process() throws IOException {
        int index = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < arr[i]; j++) {
                index++;
                if (index == total) {
                    A = i + 1;
                    B = j + 1;
                    return;
                }
            }
        }
    }
    
    static void output() throws IOException {
        bw.write(A + " " + B + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}
