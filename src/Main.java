import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        arr = new int[9];
        int sum = 0;
        int fakeIndex1 = -1;
        int fakeIndex2 = -1;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        loop1:
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                if (sum - arr[i] - arr[j] == 100) {
                    fakeIndex1 = i;
                    fakeIndex2 = j;
                    break loop1;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == fakeIndex1 || i == fakeIndex2) {
                continue;
            }
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
