import java.io.*;

public class Main {
    // declare
    static int n, idx;
    static String input;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        idx = 1;
        while (true) {
            input = br.readLine();
            if (input.equals("0")) break;
            bw.write("Case " + idx + ": Sorting... done!" + "\n");
            idx++;
        }

        bw.flush();
        bw.close();
    }
}