import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int s, e, q;
    static String chatting;
    static Set<String> in, out;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        s = stringToMinute(st.nextToken());
        e = stringToMinute(st.nextToken());
        q = stringToMinute(st.nextToken());
    }
    
    static int stringToMinute(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
    
    static void process() throws IOException {
        in = new TreeSet<>();
        out = new TreeSet<>();
        chatting = "";
        int minute;
        String name;
        while ((chatting = br.readLine()) != null) {
            st = new StringTokenizer(chatting);
            minute = stringToMinute(st.nextToken());
            name = st.nextToken();
            if (minute <= s) {
                in.add(name);
            }
            if (minute >= e && minute <= q) {
                out.add(name);
            }
        }
        int result = 0;
        for (String string : in) {
            if (out.contains(string)) {
                result++;
            }
        }
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