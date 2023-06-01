import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             peopleInTrain;
    static int             maxPeopleInTrain;
    static int             in;
    static int             out;
    
    static void input() throws IOException {
        peopleInTrain    = 0;
        maxPeopleInTrain = 0;
        
        for (int i = 0; i < 10; i++) {
            stk();
            out              = Integer.parseInt(st.nextToken());
            in               = Integer.parseInt(st.nextToken());
            peopleInTrain -= out;
            peopleInTrain += in;
            maxPeopleInTrain = Math.max(maxPeopleInTrain, peopleInTrain);
        }
        
        bw.write(maxPeopleInTrain + endl);
    }
    
    static void process() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}