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
    static int             sequenceLength, targetSum, leftIndex, rightIndex, sum, minSum;
    static int[] sequence;
    
    public static void main(String[] args) throws IOException {
        // read
        st             = new StringTokenizer(br.readLine());
        sequenceLength = Integer.parseInt(st.nextToken());
        targetSum      = Integer.parseInt(st.nextToken());
        
        sequence = new int[sequenceLength + 1];
        st       = new StringTokenizer(br.readLine());
        for (int i = 0; i < sequenceLength; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        minSum     = Integer.MAX_VALUE;
        sum        = 0;
        leftIndex  = 0;
        rightIndex = 0;
        
        while (leftIndex <= sequenceLength && rightIndex <= sequenceLength) {
            if (sum >= targetSum && minSum > rightIndex - leftIndex) {
                minSum = rightIndex - leftIndex;
            }
            
            if (sum < targetSum) {
                sum += sequence[rightIndex++];
            } else {
                sum -= sequence[leftIndex++];
            }
        }
        // write
        if (minSum == Integer.MAX_VALUE) {
            minSum = 0;
        }
        bw.write(minSum + "");
        bw.flush();
        bw.close();
    }
}