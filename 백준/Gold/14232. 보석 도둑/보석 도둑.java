import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static long K;
    static long temp;
    static long count;
    static ArrayList<Long> arrayList;
    
    public static void main(String[] args) throws IOException {
        // read
        K = Long.parseLong(br.readLine());
        
        // solve
        count = 0;
        arrayList = new ArrayList<>();
        temp = 2;
        
        while (temp * temp <= K) {
            if (K % temp == 0) {
                arrayList.add(temp);
                K /= temp;
            } else {
                temp++;
            }
        }
        arrayList.add(K);
        
        // write
        bw.write(arrayList.size() + "\n");
        for (int i = 0; i < arrayList.size(); i++) {
            bw.write(arrayList.get(i) + " ");
        }
        bw.flush();
        bw.close();
    }
}