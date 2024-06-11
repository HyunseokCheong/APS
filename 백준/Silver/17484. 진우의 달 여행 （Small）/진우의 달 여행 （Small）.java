import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	// declare
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m, result;
	static final int[] dx = {-1, 0, 1};
	static int[][] board;
	
	public static void main(String[] args) throws IOException {
		// input
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// process
		result = Integer.MAX_VALUE;
		for (int i = 0; i < m; i++) {
			recur(0, i, -1, 0);
		}
		
		// print
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
	
	static void recur(int y, int x, int dir, int sum) {
		if (y == n) {
			result = Math.min(result, sum);
			return;
		}
		for (int i = 0; i < 3; i++) {
			if (dir == i) {
				continue;
			}
			int nx = x + dx[i];
			if (nx >= 0 && nx < m) {
				recur(y + 1, nx, i, sum + board[y][x]);
			}
		}
	}
}