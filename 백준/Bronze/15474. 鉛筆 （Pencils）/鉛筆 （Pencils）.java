import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader  br    = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw    = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static String          endl  = "\n";
    static String          blank = " ";
    static int             N;
    static int             aQuantity;
    static int             aPrice;
    static int             bQuantity;
    static int             bPrice;
    static int             curPrice;
    static int             minPrice;
    
    static void input() throws IOException {
        stk();
        N         = Integer.parseInt(st.nextToken());
        aQuantity = Integer.parseInt(st.nextToken());
        aPrice    = Integer.parseInt(st.nextToken());
        bQuantity = Integer.parseInt(st.nextToken());
        bPrice    = Integer.parseInt(st.nextToken());
    }
    
    static int getMinPrice(int quantity, int price) {
        if (N % quantity == 0) {
            return (N / quantity) * price;
        }
        return ((N / quantity) + 1) * price;
    }
    
    static void process() throws IOException {
        curPrice = getMinPrice(aQuantity, aPrice);
        minPrice = Math.min(curPrice, getMinPrice(bQuantity, bPrice));
        bw.write(minPrice + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
    
    static void stk() throws IOException {
        st = new StringTokenizer(br.readLine());
    }
}