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
    static int             N; // 지하철 승강장까지 걸어가는 시간
    static int             A; // 마지막 버스가 도착하는 시간
    static int             B; // 마지막 지하철이 도착하는 시간
    static String          answer;
    
    static void input() throws IOException {
        stk();
        N = Integer.parseInt(st.nextToken());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }
    
    /**
     * N <= B: 걸어가는 시간은 항상 지하철 도착 시간보다 작거나 같으니까 고려하지 않아도 된다.
     *
     * @throws IOException
     */
    static void process() throws IOException {
        answer = A < B ? "Bus" : A > B ? "Subway" : "Anything";
        bw.write(answer + endl);
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