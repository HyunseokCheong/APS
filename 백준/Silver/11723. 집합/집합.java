import java.io.*;
import java.util.*;

public class Main {
	
	// declare
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		// input
		int m = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		
		// process
		String command;
		int number = 0;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			command = st.nextToken();
			if (!"all".equals(command) && !"empty".equals(command)) {
				number = Integer.parseInt(st.nextToken());
			}
			
			switch (command) {
				case "add":
					set.add(number);
					break;
				case "remove":
					set.remove(number);
					break;
				case "check":
					bw.write(set.contains(number) ? "1\n" : "0\n");
					break;
				case "toggle":
					if (set.contains(number)) {
						set.remove(number);
					} else {
						set.add(number);
					}
					break;
				case "all":
					set = new HashSet<>();
					for (int j = 1; j < 21; j++) {
						set.add(j);
					}
					break;
				case "empty":
					set = new HashSet<>();
					break;
			}
		}
		
		// print
		bw.flush();
		bw.close();
	}
}