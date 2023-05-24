/**
 * Main의 설명을 여기 작성한다.
 * <p>
 * 1 <= A, B <= 1,000 1 2 2 3 3 3 4 4 4 4 ... 1 ~ 1000까지 배열 만들어두고 주어진 구간의 합 구하기
 *
 * @author hyunseokcheong
 * @Date 2023/01/06
 **/

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int[] arr;
    static int A, B, count;
    static int answer;
    
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        
        // solve
        arr = new int[1002];
        count = 1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                if (count == 1001) {
                    break;
                }
                arr[count] = i;
                count++;
            }
        }
        
        answer = 0;
        for (int i = A; i <= B; i++) {
            answer += arr[i];
        }
        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}