import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m, h, result;
	static int[][] board;
	static boolean[] visited;
	static List<Point> pointList;
	static Point home;

	static class Point {
		int row, col;

		public Point(int row, int col) {
			this.row = row;
			this.col = col;
		}
	}

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		board = new int[n][n];
		pointList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num == 1) {
					home = new Point(i, j);
				}
				if (num == 2) {
					pointList.add(new Point(i, j));
				}
			}
		}
	}

	static void process() throws IOException {
		result = 0;
		visited = new boolean[pointList.size()];
		for (int i = 0; i < pointList.size(); i++) {
			Point cur = pointList.get(i);
			int dist = Math.abs(home.row - cur.row) + Math.abs(home.col - cur.col);
			if (dist <= m) {
				calc(cur, i, m - dist + h, 1);
			}
		}
		bw.write(result + "\n");
	}

	static void calc(Point cur, int idx, int hp, int count) {
		visited[idx] = true;
		for (int i = 0; i < pointList.size(); i++) {
			if (visited[i]) {
				continue;
			}
			Point next = pointList.get(i);
			int dist = Math.abs(cur.row - next.row) + Math.abs(cur.col - next.col);
			if (dist <= hp) {
				calc(next, i, hp - dist + h, count + 1);
			}
		}
		if (hp >= Math.abs(cur.row - home.row) + Math.abs(cur.col - home.col)) {
			result = Math.max(result, count);
		}
		visited[idx] = false;
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