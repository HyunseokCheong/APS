import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, count;
    static String result;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        count = 0;
        st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            count += Integer.parseInt(st.nextToken());
        }
        
        if (count > 0) {
            result = "Right";
        }
        if (count == 0) {
            result = "Stay";
        }
        if (count < 0) {
            result = "Left";
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}