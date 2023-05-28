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
    static int             numberOfCandidate;
    static int             countToBuy;
    static int             maxVote;
    static int             maxVoteIndex;
    static int[]           candidates;
    
    
    public static void main(String[] args) throws IOException {
        // read
        numberOfCandidate = Integer.parseInt(br.readLine());
        candidates        = new int[numberOfCandidate];
        for (int i = 0; i < numberOfCandidate; i++) {
            candidates[i] = Integer.parseInt(br.readLine());
        }
        
        // solve
        countToBuy   = 0;
        maxVote      = Integer.MIN_VALUE;
        maxVoteIndex = -1;
        while (true) {
            
            for (int i = 0; i < numberOfCandidate; i++) {
                if (maxVote <= candidates[i]) {
                    maxVote      = candidates[i];
                    maxVoteIndex = i;
                }
            }
            
            if (maxVoteIndex == 0) {
                break;
            }
            
            countToBuy++;
            maxVote--;
            candidates[maxVoteIndex]--;
            candidates[0]++;
        }
        
        // write
        bw.write(countToBuy + "");
        bw.flush();
        bw.close();
    }
}