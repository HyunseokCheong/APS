import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String line;
    static Map<String, Integer> nameTimeMap;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        nameTimeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                int time = workTime(j);
                line = br.readLine();
                for (String name : line.split(" ")) {
                    if (Objects.equals(name, "-")) {
                        continue;
                    }
                    if (nameTimeMap.containsKey(name)) {
                        nameTimeMap.put(name, nameTimeMap.get(name) + time);
                        continue;
                    }
                    nameTimeMap.put(name, time);
                }
            }
        }
        if (nameTimeMap.isEmpty()) {
            bw.write("Yes" + "\n");
            return;
        }
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;
        for (Integer value : nameTimeMap.values()) {
            minTime = Math.min(minTime, value);
            maxTime = Math.max(maxTime, value);
        }
        if (isFair(maxTime, minTime)) {
            bw.write("Yes" + "\n");
            return;
        }
        bw.write("No" + "\n");
    }
    
    static boolean isFair(int a, int b) {
        return a - b <= 12;
    }
    
    static int workTime(int idx) {
        switch (idx) {
            case 0:
            case 2:
                return 4;
            case 1:
                return 6;
            case 3:
                return 10;
        }
        return 0;
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