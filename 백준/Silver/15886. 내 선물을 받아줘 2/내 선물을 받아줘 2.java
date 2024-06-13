import java.io.*;

public class Main {
	
	// declare
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// input
		int n = Integer.parseInt(br.readLine());
		char[] board = br.readLine().toCharArray();
		
		// process
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (board[i] == 'E' && board[i + 1] == 'W') {
				count++;
			}
		}
		
		// print
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}