/**
 * 1. 이미 정렬되어 있는 경우 -> N
 * 2. 한 구간 빼고 정렬되어 있는 경우
 * 2-1. arr[i - 1] <= arr[i + 1] -> +1
 * 2-2. arr[i] <= arr[i + 1] -> +1
 * 3. 두 구간 이상 뺴고 정렬되어 있는 경우 -> 0
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int             N;
    static int[]           arr;
    static int             answer, count, position;
    
    public static void main(String[] args) throws IOException {
        // read
        N   = Integer.parseInt(br.readLine());
        arr = new int[N];
        st  = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        count    = 0;
        position = 0;
        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                position = i;
                count++;
            }
        }
        
        answer = 0;
        if (count == 0) {
            answer = N;
        } else if (count == 1) {
            if (position == N - 2) {
                if (arr[position - 1] <= arr[position + 1]) {
                    answer = 2;
                } else {
                    answer = 1;
                }
            } else if (position == 0) {
                if (arr[position] <= arr[position + 2]) {
                    answer = 2;
                } else {
                    answer = 1;
                }
            } else {
                if (arr[position - 1] <= arr[position + 1]) {
                    answer++;
                }
                if (arr[position] <= arr[position + 2]) {
                    answer++;
                }
            }
        }
        
        // write
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}