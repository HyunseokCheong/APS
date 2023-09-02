import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static char[] players;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        players = new char[26];
        while (n-- > 0) {
            players[br.readLine().charAt(0) - 'a']++;
        }
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (players[i] >= 5) {
                flag = true;
                bw.write((char) (i + 'a'));
            }
        }
        if (!flag) {
            bw.write("PREDAJA");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}