import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int N;
    static int price;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        price = Integer.parseInt(br.readLine());
        
        // solve
        if (N >= 20) {
            price = Math.min(price * 75 / 100, price - 2000);
        } else if (N >= 15) {
            price = Math.min(price * 90 / 100, price - 2000);
        } else if (N >= 10) {
            price = Math.min(price * 90 / 100, price - 500);
        } else if (N >= 5) {
            price -= 500;
        }
        
        if (price < 0) {
            price = 0;
        }
        
        // write
        bw.write(price + "");
        bw.flush();
        bw.close();
    }
}