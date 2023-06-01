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
    static int N, A, K;
    static int temp;
    
    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        
        // solve
        temp = N / A;
        K = temp;
        while (temp >= A) {
            temp /= A;
            K += temp;
        }
        
        // write
        bw.write(K + "");
        bw.flush();
        bw.close();
    }
}