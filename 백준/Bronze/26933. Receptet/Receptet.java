import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, h, b, k;
    static int result;
    
    public static void main(String[] args) throws IOException {
        result = 0;
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            h = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            result += Math.max((b - h), 0) * k;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}