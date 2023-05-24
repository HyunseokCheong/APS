import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        // string -> char[]
        char[] arr = input.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[arr.length - 1 - i] = arr[i];

        // char[] -> string
        String ans = new String(rev);

        bw.write(ans + "\n");
        bw.flush();
        bw.close();
    }
}