import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        long result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result += Math.abs(arr[i] - arr[j]);
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}