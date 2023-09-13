import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int result = 1, height = arr[n - 1];
        for (int i = n - 2; i > -1; i--) {
            if (arr[i] > height) {
                height = arr[i];
                result++;
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}