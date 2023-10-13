import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String input;
    
    static void input() throws IOException {
        while (true) {
            input = br.readLine();
            if (input == null) {
                break;
            }
            bw.write(input + "\n");
        }
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        output();
    }
}