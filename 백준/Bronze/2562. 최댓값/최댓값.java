import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int mxv = (int) -1e9;
        int mxi = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n > mxv) {
                mxv = n;
                mxi = i + 1;
            }
        }
        br.close();
        System.out.println(mxv);
        System.out.println(mxi);
    }
}