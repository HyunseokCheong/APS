import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());
        int s3 = Integer.parseInt(st.nextToken());
        int[] sum = new int[81];
        int maxCount = 0;
        int maxIdx = 0;
        for (int i = 1; i < s1 + 1; i++) {
            for (int j = 1; j < s2 + 1; j++) {
                for (int k = 1; k < s3 + 1; k++) {
                    sum[i + j + k]++;
                    if (sum[i + j + k] > maxCount) {
                        maxCount = sum[i + j + k];
                        maxIdx = i + j + k;
                    }
                }
            }
        }
        bw.write(maxIdx + "\n");
        bw.flush();
        bw.close();
    }
}