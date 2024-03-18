import java.io.*;
import java.util.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> data = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
			data.add(list.get(i));
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}

		Collections.sort(list, (o1, o2) -> {
			if (map.get(o1) == map.get(o2)) {
				return data.indexOf(o1) - data.indexOf(o2);
			} else {
				return Integer.compare(map.get(o2), map.get(o1));
			}
		});

		for (int i = 0; i < n; i++) {
			bw.write(list.get(i) + " ");
		}
		bw.flush();
		bw.close();
	}
}