import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final String SMUPC = "WelcomeToSMUPC";
    static final int SIZE = SMUPC.length();
    static int n;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        cut();
    }

    static void cut() {
        if (n % 14 == 0) {
            System.out.println(SMUPC.charAt(SIZE - 1));
            return;
        }
        System.out.println(SMUPC.charAt(n % SIZE - 1));
    }
}