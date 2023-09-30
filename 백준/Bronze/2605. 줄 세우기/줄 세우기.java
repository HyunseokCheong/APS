import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static List<Integer> list;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int studentNumber = i + 1;
            int scg = Integer.parseInt(st.nextToken());
            list.add(list.size() - scg, studentNumber);
        }
        for (int number : list) {
            bw.write(number + " ");
        }
        bw.flush();
        bw.close();
    }
}