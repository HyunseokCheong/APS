import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static String remainDate;
    static int count;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        
        // solve
        count = 0;
        while (N-- > 0) {
            remainDate = br.readLine();
            
            // 1자리
            if (remainDate.length() == 3) {
                count++;
                
                // 2자리
            } else if (remainDate.length() == 4) {
                if (remainDate.charAt(2) == '9') {
                    if (remainDate.charAt(3) == '0') {
                        count++;
                    }
                } else {
                    count++;
                }
            }
        }
        
        // write
        bw.write(count + "");
        bw.flush();
        bw.close();
    }
}