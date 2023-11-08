import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[1002];
        if (m > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                arr[Integer.parseInt(st.nextToken())] = 1;
            }
        }
    }
    
    static void process() throws IOException {
        int result = Integer.MAX_VALUE;
        for (int x = 1; x < 1002; x++) {
            if (arr[x] == 1) {
                continue;
            }
            for (int y = 1; y < 1002; y++) {
                if (arr[y] == 1) {
                    continue;
                }
                for (int z = 1; z < 1002; z++) {
                    if (arr[z] == 1) {
                        continue;
                    }
                    result = Math.min(result, Math.abs(n - x * y * z));
                }
            }
        }
        bw.write(result + "\n");
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