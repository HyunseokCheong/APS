import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, h, w;
    static char[] input, overWrite;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        overWrite = new char[n * w];
        Arrays.fill(overWrite, '?');
        for (int i = 0; i < h; i++) {
            input = br.readLine().toCharArray();
            for (int j = 0; j < n * w; j++) {
                if (input[j] != '?') {
                    overWrite[j] = input[j];
                }
            }
        }
    }
    
    static void process() throws IOException {
        for (int i = 0; i < n * w; i += w) {
            for (int j = i; j < i + w; j++) {
                if (overWrite[j] != '?') {
                    bw.write(overWrite[j] + "");
                    break;
                }
                if (j == i + w - 1) {
                    bw.write("?");
                }
            }
        }
        bw.write("\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}