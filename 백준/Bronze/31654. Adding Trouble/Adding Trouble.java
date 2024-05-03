import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int a, b, c;
	static String answer;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
	}

	static void process() throws IOException {
		if (a + b == c) {
			answer = "correct!";
		} else {
			answer = "wrong!";
		}
	}

	static void output() throws IOException {
		bw.write(answer + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		input();
		process();
		output();
	}
}