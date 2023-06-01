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
    
    static int sequenceLength, oddCount, evenCount, maxOddCount, maxEvenCount, rightIndex;
    static int[] sequence;
    
    public static void main(String[] args) throws IOException {
        // read
        st             = new StringTokenizer(br.readLine());
        sequenceLength = Integer.parseInt(st.nextToken());
        maxOddCount    = Integer.parseInt(st.nextToken());
        
        st       = new StringTokenizer(br.readLine());
        sequence = new int[sequenceLength];
        for (int i = 0; i < sequenceLength; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        maxEvenCount = Integer.MIN_VALUE;
        oddCount     = 0;
        evenCount    = 0;
        
        for (int leftIndex = 0; leftIndex < sequenceLength; leftIndex++) {
            
            while (oddCount <= maxOddCount && rightIndex < sequenceLength) {
                if (sequence[rightIndex] % 2 == 1) {
                    oddCount++;
                } else {
                    evenCount++;
                }
                
                rightIndex++;
                if (leftIndex == 0 && rightIndex == sequenceLength) {
                    maxEvenCount = evenCount;
                    break;
                }
            }
            
            if (oddCount == maxOddCount + 1) {
                maxEvenCount = Math.max(maxEvenCount, evenCount);
            }
            
            if (sequence[leftIndex] % 2 == 1) {
                oddCount -= 1;
            } else {
                evenCount -= 1;
            }
        }
        
        // write
        bw.write(maxEvenCount + "");
        bw.flush();
        bw.close();
    }
}