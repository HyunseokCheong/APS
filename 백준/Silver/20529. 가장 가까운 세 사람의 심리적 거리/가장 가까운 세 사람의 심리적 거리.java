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
    static int             testCase;
    static int             numberOfPerson;
    static int             checkValue;
    static int             tempValue;
    static int             minValue;
    static String[]        person;
    
    static int checkDiff(int X, int Y) {
        checkValue = 0;
        
        for (int i = 0; i < 4; i++) {
            if (person[X].charAt(i) != person[Y].charAt(i)) {
                checkValue++;
            }
        }
        return checkValue;
    }
    
    public static void main(String[] args) throws IOException {
        // read
        testCase = Integer.parseInt(br.readLine());
        
        while (testCase-- > 0) {
            numberOfPerson = Integer.parseInt(br.readLine());
            st             = new StringTokenizer(br.readLine());
            person         = new String[numberOfPerson];
            for (int i = 0; i < numberOfPerson; i++) {
                person[i] = st.nextToken();
            }
            
            // solve
            minValue = Integer.MAX_VALUE;
            
            for (int i = 0; i < numberOfPerson - 2; i++) {
                for (int j = i + 1; j < numberOfPerson - 1; j++) {
                    for (int k = j + 1; k < numberOfPerson; k++) {
                        tempValue = checkDiff(i, j) + checkDiff(i, k) + checkDiff(j, k);
                        minValue  = Math.min(minValue, tempValue);
                        if (minValue == 0) {
                            break;
                        }
                    }
                    if (minValue == 0) {
                        break;
                    }
                }
                if (minValue == 0) {
                    break;
                }
            }
            bw.write(minValue + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}