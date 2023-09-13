import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input;
    static String string;
    static int[] counter;
    static char[] chars;
    static int maxValue;

    public static void main(String[] args) throws IOException {
        string = "";
        counter = new int[26];
        while ((input = br.readLine()) != null) {
            string += input.replace(" ", "");
        }
        chars = string.toCharArray();
        maxValue = -1;
        for (char c : chars) {
            counter[c - 'a']++;
            maxValue = Math.max(maxValue, counter[c - 'a']);
        }
        string = "";
        for (int i = 0; i < 26; i++) {
            if (counter[i] == maxValue) {
                bw.write((char) (i + 'a'));
            }
        }

        bw.write("\n");
        bw.flush();
        bw.close();
    }
}