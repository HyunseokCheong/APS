import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static final String ENTER = "ENTER";
    static String name;
    static Set<String> names;
    static int result;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        result = 0;
        names = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            name = br.readLine();
            if (ENTER.equals(name)) {
                result += names.size();
                names = new TreeSet<>();
                continue;
            }
            names.add(name);
        }
        result += names.size();
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