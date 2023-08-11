import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        int[] reverse = new int[N + 1];
        for (int i = 1; i < N + 1; i++) {
            arr[i] = i;
            reverse[i] = i;
        }
        int s, e;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());
            // rotate s ~ e
            for (int j = s; j < e + 1; j++) {
                reverse[j] = arr[e - j + s];
            }
            for (int j = s; j < e + 1; j++) {
                arr[j] = reverse[j];
            }
        }
        for (int i = 1; i < N + 1; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
