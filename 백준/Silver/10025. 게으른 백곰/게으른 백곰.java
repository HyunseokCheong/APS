import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static final int MAX_POSITION = 1000001;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken()) * 2 + 1;
		int[] buckets = new int[MAX_POSITION];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			buckets[x] = g;
		}
		
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < MAX_POSITION; i++) {
			if (i >= k) {
				sum -= buckets[i - k];
			}
			sum += buckets[i];
			maxSum = Math.max(maxSum, sum);
		}
		
		bw.write(maxSum + "\n");
		bw.flush();
		bw.close();
	}
}