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
    static int             year;
    
    static void input() throws IOException {
        year = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        if (isYoon(year)) {
            bw.write(1 + blank);
        } else {
            bw.write(0 + blank);
        }
        
        bw.flush();
        bw.close();
    }
    
    static boolean isYoon(int year) {
        return (year % 4 == 0 && year % 100 != 0) | (year % 400 == 0);
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}