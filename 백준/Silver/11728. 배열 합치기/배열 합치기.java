import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n + m];

        String[] arrA = br.readLine().split(" ");
        String[] arrB = br.readLine().split(" ");

        for (int i = 0; i < n + m; i++) {
            if (i < n) arr[i] = Integer.parseInt(arrA[i]);
            else arr[i] = Integer.parseInt(arrB[i - n]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < n + m; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}