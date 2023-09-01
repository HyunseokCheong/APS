import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static final String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
    
    public static void main(String[] args) throws IOException {
        int count = 0;
        String input = br.readLine();
        
        for (String s : croatia) {
            if (input.contains(s)) {
                input = input.replace(s, " ");
            }
        }
        count = input.length();
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}