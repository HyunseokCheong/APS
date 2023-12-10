import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static Map<Integer, Integer> numIdxMap;
    static int[] arr;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    
    static void process() throws IOException {
        numIdxMap = new TreeMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int c = arr[i];
            if (numIdxMap.containsKey(c)) {
                continue;
            }
            numIdxMap.put(c, i);
        }
        
        for (int i = 0; i < m; i++) {
            int d = Integer.parseInt(br.readLine());
            bw.write(numIdxMap.getOrDefault(d, -1) + "\n");
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