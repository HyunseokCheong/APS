import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), "*");
        String frontPattern = st.nextToken();
        String backPattern = st.nextToken();
        int frontLength = frontPattern.length();
        int backLength = backPattern.length();
        String line;
        String frontLine, backLine;
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            if (line.length() < frontLength + backLength) {
                bw.write("NE" + "\n");
                continue;
            }
            frontLine = line.substring(0, frontLength);
            backLine = line.substring(line.length() - backLength);
            if (frontLine.equals(frontPattern) && backLine.equals(backPattern)) {
                bw.write("DA" + "\n");
                continue;
            }
            bw.write("NE" + "\n");
        }
        bw.flush();
        bw.close();
    }
}