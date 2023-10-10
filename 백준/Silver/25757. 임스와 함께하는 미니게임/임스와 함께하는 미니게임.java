import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, player, result;
    static final int Y = 2, F = 3, O = 4;
    static String type;
    static Set<String> names;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        type = st.nextToken();
    }
    
    static void process() throws IOException {
        result = 0;
        names = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            names.add(br.readLine());
        }
        
        player = type.equals("Y") ? Y : type.equals("F") ? F : O;
        result = names.size() / (player - 1);
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