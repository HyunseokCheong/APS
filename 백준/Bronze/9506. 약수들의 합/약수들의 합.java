import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i <n; i++) {
                if (n % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            
            if (sum != n) {
                bw.write(n + " is NOT perfect." + "\n");
                continue;
            }
            
            bw.write(n + " = " + 1 + "");
            for (int i : list) {
                if (i == 1) {
                    continue;
                }
                bw.write(" + " + i);
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}