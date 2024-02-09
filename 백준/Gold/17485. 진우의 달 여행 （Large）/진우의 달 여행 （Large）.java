import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m, result;
	static int[][] board;
	static int[][][] dp;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		dp = new int[n][m][3];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}

	static void process() throws IOException {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0) {
					dp[i][j][0] = board[i][j];
					dp[i][j][1] = board[i][j];
					dp[i][j][2] = board[i][j];
				} else if (j == m - 1) {
					dp[i][j][0] = Integer.MAX_VALUE;
				} else if (j == 0) {
					dp[i][j][2] = Integer.MAX_VALUE;
				}
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (isValid(i - 1, j + 1)) {
					dp[i][j][0] = Math.min(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]) + board[i][j];
				}
				if (isValid(i - 1, j)) {
					dp[i][j][1] = Math.min(dp[i - 1][j][0], dp[i - 1][j][2]) + board[i][j];
				}
				if (isValid(i - 1, j - 1)) {
					dp[i][j][2] = Math.min(dp[i - 1][j - 1][0], dp[i - 1][j - 1][1]) + board[i][j];
				}
			}
		}

		result = Integer.MAX_VALUE;
		for (int j = 0; j < m; j++) {
			for (int k = 0; k < 3; k++) {
				result = Math.min(result, dp[n - 1][j][k]);
			}
		}
		bw.write(result + "\n");
	}

	static boolean isValid(int row, int col) {
		return row >= 0 && row < n && col >= 0 && col < m;
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