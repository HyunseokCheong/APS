import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, n, result;
    static String name, type;
    static Map<String, Set<String>> structure;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        structure = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            type = st.nextToken();
            if (structure.containsKey(type)) {
                Set<String> set = structure.get(type);
                set.add(name);
                structure.put(type, set);
                continue;
            }
            Set<String> set = new HashSet<>();
            set.add(name);
            structure.put(type, set);
        }
    }
    
    static void process() throws IOException {
        result = 1;
        for (String string : structure.keySet()) {
            result *= structure.get(string).size() + 1;
        }
        bw.write(result - 1 + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            input();
            process();
        }
        output();
    }
}