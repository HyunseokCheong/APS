import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int n;
    static int[] arr;
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // solve
        Arrays.sort(arr);

        if (n % 2 == 0) {
            answer = arr[n / 2 - 1];
        } else {
            answer = arr[n / 2];
        }

        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}