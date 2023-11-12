import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final String CAMBRIDGE = "CAMBRIDGE";
    static char[] arr;
    
    static void input() throws IOException {
        arr = br.readLine().toCharArray();
    }
    
    static void process() throws IOException {
        loop1:
        for (char c : arr) {
            for (int i = 0; i < CAMBRIDGE.length(); i++) {
                if (c == CAMBRIDGE.charAt(i)) {
                    continue loop1;
                }
            }
            bw.write(c + "");
        }
        bw.newLine();
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