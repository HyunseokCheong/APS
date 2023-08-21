import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            char[] chars1 = input[0].toCharArray();
            char[] chars2 = input[1].toCharArray();
            Arrays.sort(chars1);
            Arrays.sort(chars2);

            String ans = "Impossible";
            if (Arrays.equals(chars1, chars2)) ans = "Possible";
            bw.write(ans + "\n");
        }
        bw.flush();
    }
}