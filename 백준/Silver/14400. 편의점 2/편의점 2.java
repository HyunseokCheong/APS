import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    static StringTokenizer st;
    // declare
    static int n;
    static int[] arrX, arrY;
    static int midX, midY, midLeftX, midRightX, midLeftY, midRightY;
    static long answerLeftX, answerRightX, answerLeftY, answerRightY;
    static long answer;
    
    public static void main(String[] args) throws IOException {
        // read
        n = sc.nextInt();
        arrX = new int[n];
        arrY = new int[n];
        
        for (int i = 0; i < n; i++) {
            arrX[i] = sc.nextInt();
            arrY[i] = sc.nextInt();
        }
        
        // solve
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        answerLeftX = 0;
        answerLeftY = 0;
        answerRightX = 0;
        answerRightY = 0;
        answer = 0;
        
        if (n % 2 != 0) {
            midX = arrX[n / 2];
            midY = arrY[n / 2];
            
            for (int i = 0; i < n; i++) {
                answer += Math.abs(arrX[i] - midX) + Math.abs(arrY[i] - midY);
            }
        } else { // n % 2 ==0
            // 1 2 3 4
            midLeftX = arrX[n / 2 - 1];
            midRightX = arrX[n / 2];
            midLeftY = arrY[n / 2 - 1];
            midRightY = arrY[n / 2];
            
            for (int i = 0; i < n; i++) {
                answerLeftX += Math.abs(arrX[i] - midLeftX);
                answerLeftY += Math.abs(arrY[i] - midLeftY);
                answerRightX += Math.abs(arrX[i] - midRightX);
                answerRightY += Math.abs(arrY[i] - midRightY);
            }
            answer = Math.min(answerLeftX + answerLeftY, answerRightX + answerRightY);
        }
        
        // write
        System.out.println(answer);
    }
}