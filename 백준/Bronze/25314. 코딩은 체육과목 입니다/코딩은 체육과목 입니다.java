import java.io.*;

public class Main {
    // declare
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // read
        n = Integer.parseInt(br.readLine());

        // solve
        while (n > 0) {
            bw.write("long ");
            n -= 4;
        }
        bw.write("int");

        // print
        bw.flush();
        bw.close();
    }
}