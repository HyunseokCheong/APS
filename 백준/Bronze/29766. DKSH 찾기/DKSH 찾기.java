import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String[] input;
    static int length;
    static final String[] DKSH = {"D", "K", "S", "H"};
    static final int LENGTH = DKSH.length;
    static int count;

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("");

        length = input.length;
        count = 0;
        loop1:
        for (int i = 0; i < length - 3; i++) {
            for (int j = 0; j < LENGTH; j++) {

                if (!input[i + j].equals(DKSH[j])) {
                    continue loop1;
                }
            }
            count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}