import java.io.*;
import java.util.*;

public class Main {

    static int solve(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) ans += i;
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            bw.write(solve(n) + "\n");
        }
        bw.flush();
        bw.close();
    }
}