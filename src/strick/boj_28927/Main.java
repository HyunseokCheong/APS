package strick.boj_28927;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 20 + Integer.parseInt(st.nextToken()) * 120;
        st = new StringTokenizer(br.readLine());
        int B = Integer.parseInt(st.nextToken()) * 3 + Integer.parseInt(st.nextToken()) * 20 + Integer.parseInt(st.nextToken()) * 120;
        
        if (A > B) {
            bw.write("Max" + "\n");
        } else if (A < B) {
            bw.write("Mel" + "\n");
        } else {
            bw.write("Draw" + "\n");
        }
        bw.flush();
        bw.close();
    }
}
