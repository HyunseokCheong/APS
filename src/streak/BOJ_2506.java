package streak;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2506 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N;
    static int[] arr;
    static int result;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        result = 0;
        st = new StringTokenizer(br.readLine());
        int streak = -1;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 1) {
                streak++;
                result += arr[i] + streak;
                continue;
            }
            streak = -1;
            result += arr[i];
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
