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
    static int             row;
    static int             col;
    static int             K;
    
    static void input() throws IOException {
        st  = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        K   = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        if (row + col - 1 > K) {
            bw.write("NO" + blank);
        } else {
            bw.write("YES" + endl);
            for (int r = 1; r <= row; r++) {
                for (int c = r; c < col + r; c++) {
                    bw.write(c + blank);
                }
                bw.newLine();
            }
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}