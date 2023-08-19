import java.io.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        
        int s = 1;
        int e = 1;
        int sum = 1;
        
        while (s <= e) {
            if (sum == n) {
                count++;
            }
            if (sum < n) {
                e++;
                sum += e;
            } else if (sum >= n) {
                sum -= s;
                s++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}