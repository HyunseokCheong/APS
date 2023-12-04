import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        String result = "";
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name.contains("S")) {
                result = name;
            }
        }
        System.out.println(result);
    }
}