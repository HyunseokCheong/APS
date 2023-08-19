package baekjoon.open_0813.b;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        list.add(st.nextToken());
        list.add(st.nextToken());
        st = new StringTokenizer(br.readLine());
        list.add(st.nextToken());
        list.add(st.nextToken());
        
        Set<String> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                String cur = list.get(i) + " " + list.get(j);
                set.add(cur);
            }
        }
        
        list = new ArrayList<>(set);
        Collections.sort(list);
        
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
