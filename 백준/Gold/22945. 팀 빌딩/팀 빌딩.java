/**
 * 더 작은애가 움직여야 함
 * left < right : left ++
 * left > right : right--
 * left == right : 암거나
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
    
    static int developerCount, leftIndex, rightIndex, maxSumAbility;
    static int[] developerArr;
    
    static int getMaxSumAbility(int maxSumAbility, int leftIndex, int rightIndex) {
        return Math.max(maxSumAbility,
                (rightIndex - leftIndex - 1) * Math.min(developerArr[leftIndex], developerArr[rightIndex]));
    }
    
    public static void main(String[] args) throws IOException {
        // read
        developerCount = Integer.parseInt(br.readLine());
        
        developerArr = new int[developerCount];
        st           = new StringTokenizer(br.readLine());
        for (int i = 0; i < developerCount; i++) {
            developerArr[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        leftIndex     = 0;
        rightIndex    = developerCount - 1;
        maxSumAbility = 0;
        
        while (leftIndex != rightIndex) {
            maxSumAbility = getMaxSumAbility(maxSumAbility, leftIndex, rightIndex);
            
            if (developerArr[leftIndex] < developerArr[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        
        // write
        bw.write(maxSumAbility + "");
        bw.flush();
        bw.close();
    }
}
