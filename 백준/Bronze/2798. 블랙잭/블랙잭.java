import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static int n, m;
	static int[] arr;
	
	static void input() throws IOException {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	}
	
	static void process() throws IOException {
		int result = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int num = arr[i] + arr[j] + arr[k];
					if (num <= m) {
						result = Math.max(result, num);
					}
				}
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