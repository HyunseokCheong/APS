import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split("-");
        String result = "";
        for (String i : input) {
            result += i.charAt(0);
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}