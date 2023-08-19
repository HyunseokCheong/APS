package strick.boj_7453;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int[] A;
    static int[] B;
    static int[] C;
    static int[] D;
    static int[] AB;
    static int[] CD;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        B = new int[N];
        C = new int[N];
        D = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());
            D[i] = Integer.parseInt(st.nextToken());
        }
        
        AB = new int[N * N];
        CD = new int[N * N];
        int index = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                AB[index] = A[i] + B[j];
                CD[index] = C[i] + D[j];
                index++;
            }
        }
        
        Arrays.sort(AB);
        Arrays.sort(CD);
        
        int left = 0;
        int right = N * N - 1;
        long count = 0;
        while (left < N * N && right > -1) {
            long leftValue = AB[left];
            long rightValue = CD[right];
            long result = leftValue + rightValue;
            if (result < 0) {
                left++;
            } else if (result > 0) {
                right--;
            } else {
                long leftCount = 0;
                long rightCount = 0;
                while (left < N * N && leftValue == AB[left]) {
                    left++;
                    leftCount++;
                }
                while (right > -1 && rightValue == CD[right]) {
                    right--;
                    rightCount++;
                }
                count += leftCount * rightCount;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
