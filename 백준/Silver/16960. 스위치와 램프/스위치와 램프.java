import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static boolean[] on;
    static List<Integer>[] switches;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        switches = new List[n];
        m = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            switches[i] = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int loop = Integer.parseInt(st.nextToken());
            for (int j = 0; j < loop; j++) {
                switches[i].add(Integer.parseInt(st.nextToken()));
            }
        }
    }
    
    static void process() throws IOException {
        boolean flag = false;
        loop1:
        for (int i = 0; i < n; i++) {
            on = new boolean[m + 1];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                for (Integer target : switches[j]) {
                    on[target] = true;
                }
            }
            for (int j = 1; j < m + 1; j++) {
                if (!on[j]) {
                    continue loop1;
                }
            }
            flag = true;
        }
        int result = flag ? 1 : 0;
        bw.write(result + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}