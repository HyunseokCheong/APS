import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static Set<Integer> cards;
    static int result;
    
    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            cards = new TreeSet<>();
            while (n-- > 0) {
                cards.add(Integer.parseInt(br.readLine()));
            }
            result = 0;
            while (m-- > 0) {
                int card = Integer.parseInt(br.readLine());
                if (cards.contains(card)) {
                    result++;
                }
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}