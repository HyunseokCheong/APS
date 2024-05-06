import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m;
	static int[][] board;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n + 1][m + 1];
		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < m + 1; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}

	static void process() throws IOException {
		int[][] dp = new int[n + 1][m + 1];
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				dp[i][j] = Math.max(board[i][j] + dp[i - 1][j], board[i][j] + dp[i][j - 1]);
			}
		}
		bw.write(dp[n][m] + "\n");
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