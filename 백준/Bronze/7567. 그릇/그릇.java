import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String[] input;
    static String before;
    static int result;

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("");
        result = 0;
        before = "";
        for (String str : input) {
            if (result == 0 || !str.equals(before)) {
                before = str;
                result += 10;
                continue;
            }
            before = str;
            result += 5;
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}