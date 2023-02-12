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
    static int             liquorCount;
    static int             leftIndex, rightIndex;
    
    static int leftAnswer, rightAnswer;
    static long sum, abs, minVal;
    static int[] liquorArr;
    
    public static void main(String[] args) throws IOException {
        // read
        liquorCount = Integer.parseInt(br.readLine());
        liquorArr   = new int[liquorCount];
        st          = new StringTokenizer(br.readLine());
        for (int i = 0; i < liquorCount; i++) {
            liquorArr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        leftIndex   = 0;
        rightIndex  = liquorCount - 1;
        leftAnswer  = 0;
        rightAnswer = 0;
        minVal      = Long.MAX_VALUE;
        
        while (leftIndex < rightIndex) {
            sum = liquorArr[leftIndex] + liquorArr[rightIndex];
            abs = Math.abs(sum);
            
            if (abs < minVal) {
                minVal      = abs;
                leftAnswer  = liquorArr[leftIndex];
                rightAnswer = liquorArr[rightIndex];
                
                if (sum == 0) {
                    break;
                }
            }
            
            if (sum < 0) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        
        // write
        bw.write(leftAnswer + " " + rightAnswer + "");
        bw.flush();
        bw.close();
    }
}