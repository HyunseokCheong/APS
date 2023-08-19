import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static int[] arr = new int[12];
    static int ans = 0;

    public static void solve(int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % k == 0) ans += arr[i] / k;
                else ans += arr[i] / k + 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            // 0 여, 1 남
            if (sex == 0) arr[grade - 1]++;
            else arr[grade + 5]++;
        }

        solve(k);
        bw.write(ans + "\n");
        bw.close();
    }
}