import java.io.*;

public class Main {
    // declare
    static int n;
    static String string;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read
        n = Integer.parseInt(br.readLine());
        string = "SciComLove";

        // solve
        while (n-- > 0) {
            System.out.println(string);
        }
    }
}