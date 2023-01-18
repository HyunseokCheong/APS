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
    static int N;
    static ArrayList<Integer> arrayList;
    static int arrayListSize;
    static int curGcd, maxGcd;
    
    public static void main(String[] args) throws IOException {
        // read
        N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            arrayList = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                arrayList.add(Integer.parseInt(st.nextToken()));
            }
            
            // solve
            maxGcd = Integer.MIN_VALUE;
            arrayListSize = arrayList.size();
            for (int j = 0; j < arrayListSize - 1; j++) {
                for (int k = j + 1; k < arrayListSize; k++) {
                    if (j == k) {
                        continue;
                    }
                    curGcd = GCD(arrayList.get(j), arrayList.get(k));
                    maxGcd = Math.max(maxGcd, curGcd);
                }
            }
            bw.write(maxGcd + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
    
    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
}