import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int crosswalkCount, targetStreakCrosswalk, brokenCrosswalkCount;
    static int sum, minVal;
    static int[] crosswalkArr;
    
    
    public static void main(String[] args) throws IOException {
        // read
        st                    = new StringTokenizer(br.readLine());
        crosswalkCount        = Integer.parseInt(st.nextToken());
        targetStreakCrosswalk = Integer.parseInt(st.nextToken());
        brokenCrosswalkCount  = Integer.parseInt(st.nextToken());
        
        crosswalkArr = new int[crosswalkCount + 1];
        for (int i = 0; i < brokenCrosswalkCount; i++) {
            crosswalkArr[Integer.parseInt(br.readLine())] = 1;
        }
        
        // solve
        sum = 0;
        for (int i = 1; i <= targetStreakCrosswalk; i++) {
            sum += crosswalkArr[i];
        }
        
        minVal = sum;
        for (int i = targetStreakCrosswalk + 1; i <= crosswalkCount; i++) {
            sum += crosswalkArr[i] - crosswalkArr[i - targetStreakCrosswalk];
            minVal = Math.min(minVal, sum);
        }
        
        // write
        bw.write(minVal + "");
        bw.flush();
        bw.close();
    }
}