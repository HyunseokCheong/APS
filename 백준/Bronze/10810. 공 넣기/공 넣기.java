import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int[]           basketArray;
    static int             numberOfBasket;
    static int             numberOfQuery;
    static int             startIndex;
    static int             endIndex;
    static int             numberOfBall;
    
    public static void main(String[] args) throws IOException {
        // read
        st             = new StringTokenizer(br.readLine());
        numberOfBasket = Integer.parseInt(st.nextToken());
        numberOfQuery  = Integer.parseInt(st.nextToken());
        
        // solve
        basketArray = new int[numberOfBasket];
        for (int i = 0; i < numberOfQuery; i++) {
            st           = new StringTokenizer(br.readLine());
            startIndex   = Integer.parseInt(st.nextToken());
            endIndex     = Integer.parseInt(st.nextToken());
            numberOfBall = Integer.parseInt(st.nextToken());
            
            for (int j = startIndex - 1; j < endIndex; j++) {
                basketArray[j] = numberOfBall;
            }
        }
        
        // write
        for (int i = 0; i < numberOfBasket; i++) {
            bw.write(basketArray[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}