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
    static int             lengthOfSequence;
    static int[]           sequence;
    static int             totalCount;
    
    static int GCD(int X, int Y) {
        return Y == 0 ? X : GCD(Y, X % Y);
    }
    
    public static void main(String[] args) throws IOException {
        // read
        lengthOfSequence = Integer.parseInt(br.readLine());
        sequence         = new int[lengthOfSequence];
        st               = new StringTokenizer(br.readLine());
        for (int i = 0; i < lengthOfSequence; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }
        
        // solve
        totalCount = 0;
        Arrays.sort(sequence);
        
        for (int i = 0; i < lengthOfSequence - 1; i++) {
            totalCount += solve(sequence[i], sequence[i + 1]);
        }
        // write
        
        bw.write(totalCount + "");
        bw.flush();
        bw.close();
    }
    
    static int solve(int X, int Y) {
        if (GCD(X, Y) == 1) {
            return 0;
        }
        for (int i = X + 1; i < Y; i++) {
            if (GCD(X, i) == 1 && GCD(i, Y) == 1) {
                return 1;
            }
        }
        for (int i = X + 1; i < Y; i++) {
            for (int j = i + 1; j < Y; j++) {
                if (GCD(X, i) == 1 && GCD(i, j) == 1 && GCD(j, Y) == 1) {
                    return 2;
                }
            }
        }
        return 3;
    }
}