import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n1, k1, n2, k2;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n1 = Integer.parseInt(st.nextToken());
        k1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        k2 = Integer.parseInt(st.nextToken());

        answer = n1 * k1 + n2 * k2;
        bw.write(answer + "\n");
        bw.flush();
        bw.close();

    }
}