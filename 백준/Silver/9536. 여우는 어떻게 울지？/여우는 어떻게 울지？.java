import java.io.*;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int t;

	public static void main(String[] args) throws IOException {
		t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String data1 = br.readLine();
			while (true) {
				String data2 = br.readLine();
				if (data2.equals("what does the fox say?")) {
					break;
				}
				String data3 = data2.split(" ")[2];

				String[] words = data1.split(" ");
				StringBuilder filtered = new StringBuilder();
				for (String word : words) {
					if (!word.equals(data3)) {
						if (filtered.length() > 0) {
							filtered.append(" ");
						}
						filtered.append(word);
					}
				}
				data1 = filtered.toString();
			}
			bw.write(data1.trim() + "\n");
		}
		bw.flush();
		bw.close();
	}
}