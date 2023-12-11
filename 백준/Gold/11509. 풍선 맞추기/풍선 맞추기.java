import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10000002];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (arr[num + 1] > 0) {
                arr[num + 1]--;
            }
            arr[num]++;
        }
        int r = 0;
        for (int i = 0; i < 1000001; i++) {
            if (arr[i] > 0) {
                r += arr[i];
            }
        }
        bw.write(r + "\n");
        bw.flush();
        bw.close();
    }
}