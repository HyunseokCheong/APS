import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(solve(Integer.parseInt(br.readLine())));
    }

    public static int solve(int x) {
        int cnt = 0;
        if (x < 100) {
            return x;
        } else {
            cnt = 99;
            for (int i = 100; i <= x; i++) {
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;
                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}