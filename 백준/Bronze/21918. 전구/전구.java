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
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void process() throws IOException {
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 1) {
                arr[b - 1] = c;
            }
            if (a == 2) {
                for (int j = b - 1; j < c; j++) {
                    arr[j] = (arr[j] + 1) % 2;
                }
            }
            if (a == 3) {
                for (int j = b - 1; j < c; j++) {
                    arr[j] = 0;
                }
            }
            if (a == 4) {
                for (int j = b - 1; j < c; j++) {
                    arr[j] = 1;
                }
            }
        }
        for (int a : arr) {
            bw.write(a + " ");
        }
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