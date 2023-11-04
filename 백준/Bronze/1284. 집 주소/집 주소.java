import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static String number;
    
    static void process() throws IOException {
        number = String.valueOf(n);
        int result = 2 + number.length() - 1;
        for (char c : number.toCharArray()) {
            if (c == '1') {
                result += 2;
                continue;
            }
            if (c == '0') {
                result += 4;
                continue;
            }
            result += 3;
        }
        bw.write(result + "\n");
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            process();
        }
        output();
    }
}