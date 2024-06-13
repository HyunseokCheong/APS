import java.io.*;
import java.util.*;

public class Main {
	
	// declare
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static class Jewelry {
		int weight;
		int value;
		
		public Jewelry(int weight, int value) {
			this.weight = weight;
			this.value = value;
		}
	}
	
	public static void main(String[] args) throws IOException {
		// input
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Jewelry[] jewelries = new Jewelry[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			jewelries[i] = new Jewelry(m, v);
		}
		
		int[] bags = new int[k];
		for (int i = 0; i < k; i++) {
			bags[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(bags);
		
		// process
		Arrays.sort(jewelries, (o1, o2) -> {
			if (o1.weight == o2.weight) {
				return Integer.compare(o2.value, o1.value);
			}
			return Integer.compare(o1.weight, o2.weight);
		});
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		long result = 0;
		for (int i = 0, j = 0; i < k; i++) {
			while (j < n && jewelries[j].weight <= bags[i]) {
				queue.offer(jewelries[j++].value);
			}
			if (!queue.isEmpty()) {
				result += queue.poll();
			}
		}
		
		// print
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}