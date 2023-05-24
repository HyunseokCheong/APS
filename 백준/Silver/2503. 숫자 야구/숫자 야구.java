/**
 * 123 ~ 987 까지 대조
 *
 * @Author HyunseokCheong
 * @Date 2023-01-12
 */

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int[] tempArr;
    static int tempCount;
    static int[][] arr;
    static int count;
    static String myData, nowData;
    static int nowStrike, nowBall;
    static int myStrike, myBall;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        count = 0;
        loop1:
        for (int i = 123; i < 988; i++) {
            myData = Integer.toString(i);
            
            // check zero
            for (int j = 0; j < 3; j++) {
                if (myData.charAt(j) == '0') {
                    continue loop1;
                }
            }
            
            // check same
            tempCount = 0;
            tempArr = new int[2];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (myData.charAt(j) == myData.charAt(k)) {
                        tempCount++;
                        if (tempCount > 3) {
                            continue loop1;
                        }
                    }
                }
            }
            
            for (int j = 0; j < N; j++) {
                nowData = Integer.toString(arr[j][0]);
                nowStrike = arr[j][1];
                nowBall = arr[j][2];
                
                // strike check
                myStrike = 0;
                for (int k = 0; k < 3; k++) {
                    if (nowData.charAt(k) == myData.charAt(k)) {
                        myStrike++;
                    }
                }
                if (nowStrike != myStrike) {
                    continue loop1;
                }
                
                // ball check
                myBall = 0;
                for (int k = 0; k < 3; k++) {
                    for (int h = 0; h < 3; h++) {
                        if (nowData.charAt(k) == myData.charAt(h) && k != h) {
                            myBall++;
                        }
                    }
                }
                if (nowBall != myBall) {
                    continue loop1;
                }
            }
            count++;
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}