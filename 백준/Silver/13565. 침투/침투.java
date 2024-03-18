import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int r, c;
	static int[][] graph;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		graph = new int[r][c];
		for (int i = 0; i < r; i++) {
			String data = br.readLine();
			for (int j = 0; j < c; j++) {
				graph[i][j] = data.charAt(j) - '0';
			}
		}
	}

	static void process() throws IOException {
		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[r][c];

		for (int i = 0; i < c; i++) {
			if (graph[0][i] == 0) {
				queue.add(new int[] {0, i});
				visited[0][i] = true;
			}
		}

		int[][] dir = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cr = cur[0];
			int cc = cur[1];

			if (cr == r - 1) {
				bw.write("YES" + "\n");
				return;
			}

			for (int i = 0; i < 4; i++) {
				int nr = cr + dir[i][0];
				int nc = cc + dir[i][1];

				if (nr < 0 || nr >= r || nc < 0 || nc >= c) {
					continue;
				}
				if (visited[nr][nc]) {
					continue;
				}
				if (graph[nr][nc] == 1) {
					continue;
				}

				queue.add(new int[] {nr, nc});
				visited[nr][nc] = true;
			}
		}

		bw.write("NO" + "\n");
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