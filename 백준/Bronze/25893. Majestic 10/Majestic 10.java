import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String endl = "\n";
	static String blank = " ";
	static int n;
	static int[] arr;
	static int score;
	static String answer;

	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
	}

	static void process() throws IOException {
		while (n-- > 0) {
			solve();
			for (int i = 0; i < 3; i++) {
				bw.write(arr[i] + blank);
			}
			bw.write(endl);
			bw.write(answer + endl);
			bw.write(endl);
		}
		bw.flush();
		bw.close();
	}

	static void solve() throws IOException {
		arr = new int[3];
		score = 0;
		stk();
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] >= 10) {
				score++;
			}
		}
		answer = checkScore();
	}

	static String checkScore() {
		if (score >= 3) {
			return "triple-double";
		}
		if (score == 2) {
			return "double-double";
		}
		if (score == 1) {
			return "double";
		}
		return "zilch";
	}

	public static void main(String[] args) throws IOException {
		input();
		process();
	}

	static void stk() throws IOException {
		st = new StringTokenizer(br.readLine());
	}
}