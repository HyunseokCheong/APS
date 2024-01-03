import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int result = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num > 0) {
                result++;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}