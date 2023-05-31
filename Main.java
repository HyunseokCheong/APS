import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static long[]           arr;
    static int             testCase;
    static int             N;
    
    static void setArr() {
        arr    = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for (int i = 4; i < 101; i++) {
            arr[i] = arr[i - 3] + arr[i - 2];
        }
    }
    
    public static void main(String[] args) throws IOException {
        setArr();
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            N = Integer.parseInt(br.readLine());
            bw.write(arr[N] + endl);
        }
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}
