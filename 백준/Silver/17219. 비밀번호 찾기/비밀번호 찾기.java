import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m;
    static String address, password;
    static Map<String, String> store;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        store = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            address = st.nextToken();
            password = st.nextToken();
            store.put(address, password);
        }
        for (int i = 0; i < m; i++) {
            bw.write(store.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}