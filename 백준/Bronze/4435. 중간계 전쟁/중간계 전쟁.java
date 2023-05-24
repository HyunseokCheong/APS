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
    static int             pointOfGandalf;
    static int             pointOfSauron;
    
    public static void main(String[] args) throws IOException {
        // read
        testCase = Integer.parseInt(br.readLine());
        
        // solve
        for (int t = 1; t <= testCase; t++) {
            pointOfGandalf = 0;
            pointOfSauron  = 0;
            
            st             = new StringTokenizer(br.readLine());
            pointOfGandalf = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 2
                    + Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 3
                    + Integer.parseInt(st.nextToken()) * 4 + Integer.parseInt(st.nextToken()) * 10;
            
            st            = new StringTokenizer(br.readLine());
            pointOfSauron = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) * 2
                    + Integer.parseInt(st.nextToken()) * 2 + Integer.parseInt(st.nextToken()) * 2
                    + Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 5
                    + Integer.parseInt(st.nextToken()) * 10;
            
            bw.write("Battle " + t + ": ");
            if (pointOfGandalf > pointOfSauron) {
                bw.write("Good triumphs over Evil" + "\n");
            } else if (pointOfGandalf < pointOfSauron) {
                bw.write("Evil eradicates all trace of Good" + "\n");
            } else {
                bw.write("No victor on this battle field" + "\n");
            }
        }
        
        // write
        bw.flush();
        bw.close();
    }
}