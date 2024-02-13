import java.io.*;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		st = new StringTokenizer(br.readLine());
		long white = Long.parseLong(st.nextToken());
		long black = Long.parseLong(st.nextToken());

		long result = 0;
		if (white >= black) {
			result = black;
		}
		if (white < black) {
			result = white + 1;
		}
		System.out.println(result);
	}
}