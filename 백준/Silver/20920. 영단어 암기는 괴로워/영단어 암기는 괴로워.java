import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Integer> counter = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String data = br.readLine();
			if (data.length() < m) {
				continue;
			}
			counter.put(data, counter.getOrDefault(data, 0) + 1);
		}

		List<String> words = new ArrayList<>(counter.keySet());

		Collections.sort(words, (a, b) -> {
			if (counter.get(a).equals(counter.get(b))) {
				if (a.length() == b.length()) {
					return a.compareTo(b);
				}
				return b.length() - a.length();
			}
			return counter.get(b) - counter.get(a);
		});

		for (String word : words) {
			bw.write(word + "\n");
		}
		bw.flush();
		bw.close();
	}
}