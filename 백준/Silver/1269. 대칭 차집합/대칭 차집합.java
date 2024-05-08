import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static Set<Integer> A, B;
	static int n, m, result;

	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		A = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			A.add(Integer.parseInt(st.nextToken()));
		}
		B = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			B.add(Integer.parseInt(st.nextToken()));
		}
	}

	static void process() throws IOException {
		result = A.size() + B.size();
		for (int a : A) {
			if (B.contains(a)) {
				result--;
			}
		}
		for (int b : B) {
			if (A.contains(b)) {
				result--;
			}
		}
		bw.write(result + "\n");
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