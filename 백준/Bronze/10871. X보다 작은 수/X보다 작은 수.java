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
    static int             countOfNumbers;
    static int             targetNumber;
    static int[]           numbers;
    
    static void input() throws IOException {
        stk();
        countOfNumbers = Integer.parseInt(st.nextToken());
        targetNumber   = Integer.parseInt(st.nextToken());
        numbers        = new int[countOfNumbers];
        stk();
        for (int i = 0; i < countOfNumbers; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        for (int i = 0; i < countOfNumbers; i++) {
            if (numbers[i] < targetNumber) {
                bw.write(numbers[i] + blank);
            }
        }
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