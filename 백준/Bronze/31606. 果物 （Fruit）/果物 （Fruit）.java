import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		bw.write(x + y + 3 + "\n");
		bw.flush();
		bw.close();
	}
}