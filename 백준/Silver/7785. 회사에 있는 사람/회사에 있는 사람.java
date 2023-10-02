import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static String name, state;
    static Set<String> company;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
    }
    
    static void process() throws IOException {
        company = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            state = st.nextToken();
            if (Objects.equals(state, "enter")) {
                company.add(name);
                continue;
            }
            company.remove(name);
        }
        ArrayList<String> companyList = new ArrayList<>(company);
        companyList.sort(Comparator.reverseOrder());
        for (String s : companyList) {
            bw.write(s + "\n");
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