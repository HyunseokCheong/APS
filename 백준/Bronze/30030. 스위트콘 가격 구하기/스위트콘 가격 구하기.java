import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static int answer;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());

        answer = n / 11 * 10;

        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}