import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, d;
    static int[] arr;
    static Map<Integer, Integer> numIdxMap;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        numIdxMap = new TreeMap<>();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    
    static void process() throws IOException {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (!numIdxMap.containsKey(arr[i])) {
                numIdxMap.put(arr[i], i);
            }
        }
        for (int i = 0; i < m; i++) {
            d = Integer.parseInt(br.readLine());
            if (!numIdxMap.containsKey(d)) {
                bw.write(-1 + "\n");
            }
            if (numIdxMap.containsKey(d)) {
                bw.write(numIdxMap.get(d) + "\n");
            }
        }
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