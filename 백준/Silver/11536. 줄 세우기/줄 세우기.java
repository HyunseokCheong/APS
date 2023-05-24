import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static String[] str, sort_str;
    static boolean check = false;
    static String[] answer = {"INCREASING", "DECREASING", "NEITHER"};

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        str = new String[n];
        sort_str = new String[n];
        for (int i = 0; i < n; i++) str[i] = sort_str[i] = br.readLine();

        // process
        Arrays.sort(sort_str);

        // increase check
        for (int i = 0; i < n; i++) {
            if (str[i].equals(sort_str[i])) {
                check = true;
            } else {
                check = false;
                break;
            }
        }
        if (check) {
            bw.write(answer[0] + "\n");
        } else {
            // decrease check
            for (int i = 0; i < n; i++) {
                if (str[i].equals(sort_str[n - 1 - i])) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check) bw.write(answer[1] + "\n");
            else bw.write(answer[2] + "\n");
        }

        // write
        bw.flush();
        bw.close();
    }
}