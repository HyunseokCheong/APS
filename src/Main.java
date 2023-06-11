import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, k;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                bw.write('=' + "");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
