import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int x, y;
    
    static int reverse(int a) {
        String as = String.valueOf(a);
        String result = "";
        for (int i = as.length() - 1; i > -1; i--) {
            result += as.charAt(i);
        }
        return Integer.parseInt(result);
    }
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        bw.write(reverse(reverse(x) + reverse(y)) + "\n");
        bw.flush();
        bw.close();
    }
}