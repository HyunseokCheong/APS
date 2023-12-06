import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int t, n;
    static String a, b;
    
    public static void main(String[] args) throws IOException {
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            int score = 0;
            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());
                a = st.nextToken();
                b = st.nextToken();
                score += battle(a, b);
            }
            bw.write((score < 0 ? "Player 2" : score == 0 ? "TIE" : "Player 1") + "\n");
        }
        bw.flush();
        bw.close();
    }
    
    static int battle(String a, String b) {
        if (a.equals("R")) {
            if (b.equals("S")) {
                return 1;
            }
            if (b.equals("P")) {
                return -1;
            }
        }
        if (a.equals("S")) {
            if (b.equals("P")) {
                return 1;
            }
            if (b.equals("R")) {
                return -1;
            }
        }
        if (a.equals("P")) {
            if (b.equals("R")) {
                return 1;
            }
            if (b.equals("S")) {
                return -1;
            }
        }
        return 0;
    }
}