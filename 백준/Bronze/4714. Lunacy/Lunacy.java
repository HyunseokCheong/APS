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
    static double          X;
    
    public static void main(String[] args) throws IOException {
        while (true) {
            X = Double.parseDouble(br.readLine());
            if (X < 0) {
                break;
            }
            bw.write("Objects weighing " + String.format("%.2f", X) + " on Earth will weigh "
                    + String.format("%.2f", X * 0.167) + " on the moon." + endl);
        }
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}