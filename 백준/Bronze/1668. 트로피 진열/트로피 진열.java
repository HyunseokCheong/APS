import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n, l, r;
    static int[] arr;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    
    static void process() throws IOException {
        l = 0;
        r = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > temp) {
                l++;
                temp = arr[i];
            }
        }
        temp = 0;
        for (int i = n - 1; i > -1; i--) {
            if (arr[i] > temp) {
                r++;
                temp = arr[i];
            }
        }
        bw.write(l + "\n" + r + "\n");
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