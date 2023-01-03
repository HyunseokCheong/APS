import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int t;
    static int num, answer;

    public static void main(String[] args) throws IOException {
        // read
        t = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // solve
        answer = 0;
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(st.nextToken());
            if (num == t) {
                answer++;
            }
        }

        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}