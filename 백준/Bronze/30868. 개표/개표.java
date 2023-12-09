import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String result = "";
            while (n > 0) {
                if (n >= 5) {
                    n -= 5;
                    result += "++++ ";
                    continue;
                }
                n--;
                result += "|";
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}