import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    static BufferedReader br   = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw   = new BufferedWriter(new OutputStreamWriter(System.out));
    static String         endl = "\n";
    static int            N;
    static int[]          arr;
    
    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
    }
    
    static void fillArray() {
        arr    = new int[30001];
        arr[0] = 1;
        for (int i = 1; i < 30001; i++) {
            arr[i] = (arr[i - 1] * i) % 10;
        }
    }
    
    static void process() throws IOException {
        fillArray();
        bw.write(arr[N] + endl);
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
    }
}