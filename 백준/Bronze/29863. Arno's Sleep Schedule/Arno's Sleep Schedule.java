import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int sleep, wake;

    public static void main(String[] args) throws IOException {
        sleep = Integer.parseInt(br.readLine());
        wake = Integer.parseInt(br.readLine());

        int time = wake - sleep;
        if (time < 0) {
            time += 24;
        }

        bw.write(time + "\n");
        bw.flush();
        bw.close();
    }
}