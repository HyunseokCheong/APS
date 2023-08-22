import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] arr;
    
    static void solve() throws IOException {
        arr = new int[10];
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num] = arr[num] == 0 ? 1 : 0;
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) {
                bw.write(i + "\n");
                return;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}