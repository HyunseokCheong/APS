import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader     br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter     bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer    st;
    static int                maxChangeCount;
    static String             alphabetInput;
    static char[]             alphabet;
    static int                leftIndex;
    static int                rightIndex;
    static int                maxLength;
    static HashSet<Character> hashSet;
    
    public static void main(String[] args) throws IOException {
        // read
        maxChangeCount = Integer.parseInt(br.readLine());
        alphabetInput  = br.readLine();
        alphabet       = new char[alphabetInput.length()];
        hashSet        = new HashSet<>();
        for (int i = 0; i < alphabetInput.length(); i++) {
            alphabet[i] = alphabetInput.charAt(i);
            hashSet.add(alphabet[i]);
        }
        
        // solve
        if (alphabet.length == 1) {
            maxLength = 1;
        } else if (hashSet.size() <= maxChangeCount) {
            maxLength = alphabet.length;
        } else {
            leftIndex  = 0;
            rightIndex = 1;
            // set 초기화
            hashSet = new HashSet<>();
            hashSet.add(alphabet[leftIndex]);
            maxLength = 1;
            
            while (leftIndex < alphabet.length - 1) {
                // break
                if (rightIndex == alphabet.length) {
                    maxLength = Math.max(maxLength, rightIndex - leftIndex);
                    break;
                }
                
                hashSet.add(alphabet[rightIndex]);
                
                if (hashSet.size() == maxChangeCount) { // set size == maxChangeCount
                    maxLength = Math.max(maxLength, rightIndex - leftIndex + 1);
                    rightIndex++;
                } else if (hashSet.size() > maxChangeCount) { // set size >  maxChangeCount
                    hashSet.clear();
                    leftIndex++;
                    hashSet.add(alphabet[leftIndex]);
                    rightIndex = leftIndex + 1;
                } else { // set size <  maxChangeCount
                    rightIndex++;
                }
            }
        }
        
        // write
        bw.write(maxLength + "");
        bw.flush();
        bw.close();
    }
}