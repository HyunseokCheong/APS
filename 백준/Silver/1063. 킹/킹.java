import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static char[] king, stone;
	static int n;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		king = st.nextToken().toCharArray();
		stone = st.nextToken().toCharArray();
		n = Integer.parseInt(st.nextToken());
	}

	static void process() throws IOException {
		for (int i = 0; i < n; i++) {
			String cmd = br.readLine();
			char[] kingNext = king.clone();
			char[] stoneNext = stone.clone();
			move(cmd, kingNext);
			if (inRange(kingNext)) {
				continue;
			}
			if (Arrays.equals(kingNext, stone)) {
				move(cmd, stoneNext);
				if (inRange(stoneNext)) {
					continue;
				}
			}
			king = kingNext;
			stone = stoneNext;
		}
		bw.write(king[0] + "" + king[1] + "\n" + stone[0] + "" + stone[1] + "\n");
	}

	static boolean inRange(char[] next) {
		return (next[0] < 'A' || next[0] > 'H' || next[1] < '1' || next[1] > '8');
	}

	static void move(String position, char[] next) {
		switch (position) {
			case "R":
				next[0]++;
				break;
			case "L":
				next[0]--;
				break;
			case "B":
				next[1]--;
				break;
			case "T":
				next[1]++;
				break;
			case "RT":
				next[0]++;
				next[1]++;
				break;
			case "LT":
				next[0]--;
				next[1]++;
				break;
			case "RB":
				next[0]++;
				next[1]--;
				break;
			case "LB":
				next[0]--;
				next[1]--;
				break;
		}
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