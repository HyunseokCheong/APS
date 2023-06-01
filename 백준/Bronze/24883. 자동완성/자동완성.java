import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static String input;
    
    public static void main(String[] args) throws IOException {
        // read
        input = br.readLine();
        
        // solve
        if (input.charAt(0) == 'N' || input.charAt(0) == 'n') {
            System.out.println("Naver D2" + "\n");
        } else {
            System.out.println("Naver Whale" + "\n");
        }
    }
}