package streak;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_7795 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, N, M;
    static int result, S, mid, E, idx;
    static int[] A, B;
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            A = new int[N];
            B = new int[M];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                B[i] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(B);
            result = 0;
            for (int i = 0; i < N; i++) {
                S = 0;
                E = M - 1;
                idx = 0;
                while (S <= E) {
                    mid = (S + E) / 2;
                    if (B[mid] < A[i]) {
                        S = mid + 1;
                        idx = mid + 1;
                        continue;
                    }
                    E = mid - 1;
                }
                result += idx;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
