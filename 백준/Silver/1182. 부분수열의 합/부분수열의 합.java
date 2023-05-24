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
    static int             numberOfNumber;
    static int             targetNumber;
    static int             count;
    static int[]           array;
    
    static void input() throws IOException {
        stk();
        numberOfNumber = Integer.parseInt(st.nextToken());
        targetNumber   = Integer.parseInt(st.nextToken());
        array          = new int[numberOfNumber];
        stk();
        for (int i = 0; i < numberOfNumber; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        count = targetNumber == 0 ? -1 : 0;
        recur(0, 0);
        
        bw.write(count + blank);
        bw.flush();
        bw.close();
    }
    
    static void recur(int depth, int sum) {
        if (depth == numberOfNumber) {
            if (sum == targetNumber) {
                count++;
            }
            return;
        }
        recur(depth + 1, sum + array[depth]);
        recur(depth + 1, sum);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}