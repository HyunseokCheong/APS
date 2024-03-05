import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n;
	static int[] arr;
	static long[][] dp;

	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}

	static void process() throws IOException {
		dp = new long[n][21];
		dp[0][arr[0]] = 1;
		int plus, minus;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 0; j <= 20; j++) {
				if (dp[i - 1][j] != 0) {
					plus = j + arr[i];
					minus = j - arr[i];
					if (plus >= 0 && plus <= 20) {
						dp[i][plus] += dp[i - 1][j];
					}
					if (minus >= 0 && minus <= 20) {
						dp[i][minus] += dp[i - 1][j];
					}
				}
			}
		}
		bw.write(dp[n - 2][arr[n - 1]] + "\n");
	}

	static void output() throws IOException {
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		input();
		process();
		output();
	}
}