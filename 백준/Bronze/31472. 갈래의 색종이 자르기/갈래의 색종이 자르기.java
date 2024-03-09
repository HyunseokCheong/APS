import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int w = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i < w; i++) {
			if (w % i == 0 && i * i * 2 == w) {
				result = 2 * i * 4;
				break;
			}
		}
		bw.write(result + "\n");
		bw.flush();
		bw.close();
	}
}