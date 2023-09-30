import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static String monsterName, keyOrValueString;
    static int keyOrValueInteger;
    static Map<Integer, String> isMap;
    static Map<String, Integer> siMap;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        isMap = new TreeMap<>();
        siMap = new TreeMap<>();
        for (int i = 1; i < n + 1; i++) {
            monsterName = br.readLine();
            isMap.put(i, monsterName);
            siMap.put(monsterName, i);
        }
        for (int i = 0; i < m; i++) {
            keyOrValueString = br.readLine();
            if (siMap.containsKey(keyOrValueString)) {
                bw.write(siMap.get(keyOrValueString) + "\n");
                continue;
            }
            
            keyOrValueInteger = Integer.parseInt(keyOrValueString);
            if (isMap.containsKey(keyOrValueInteger)) {
                bw.write(isMap.get(keyOrValueInteger) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}