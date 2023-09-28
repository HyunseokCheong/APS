import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String a;
    static int n;
    static int answer;
    
    public static void main(String[] args) throws IOException {
        a = br.readLine();
        n = Integer.parseInt(a);
        
        if (a.contains("7")) {
            if (n % 7 == 0) {
                answer = 3;
            } else {
                answer = 2;
            }
        } else {
            if (n % 7 == 0) {
                answer = 1;
            } else {
                answer = 0;
            }
        }
        
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}