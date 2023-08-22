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
    static int n;
    static int[] arr;
    static int v;
    static int count;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        stk();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        v = Integer.parseInt(br.readLine());
    }
    
    static void solve() throws IOException {
        count = 0;
        for (int number : arr) {
            if (number == v) {
                count++;
            }
        }
        bw.write(count + "\n");
    }
    
    public static void main(String[] args) throws IOException {
        input();
        solve();
        bw.flush();
        bw.close();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}