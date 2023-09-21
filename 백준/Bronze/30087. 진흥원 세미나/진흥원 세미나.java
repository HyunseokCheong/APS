import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static Map<String, String> map;
    static int n;
    static String input, output;

    public static void main(String[] args) throws IOException {
        map = new HashMap<>();
        map.put("Algorithm", "204");
        map.put("DataAnalysis", "207");
        map.put("ArtificialIntelligence", "302");
        map.put("CyberSecurity", "B101");
        map.put("Network", "303");
        map.put("Startup", "501");
        map.put("TestStrategy", "105");

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            input = br.readLine();
            output = map.get(input);
            bw.write(output + "\n");
        }
        bw.flush();
        bw.close();
    }
}