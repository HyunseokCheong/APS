import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static List<Integer> list;
	static int n, result;

	static void input() throws IOException {
		n = Integer.parseInt(br.readLine());
	}

	static void process() throws IOException {
		list = new ArrayList<>();
		for (int i = 1; i < n + 1; i++) {
			list.add(i);
		}

		while (list.size() > 1) {
			for (int i = 0; i < list.size(); i++) {
				list.remove(i);
			}
		}
		result = list.get(0);
	}

	static void output() throws IOException {
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		input();
		process();
		output();
	}
}