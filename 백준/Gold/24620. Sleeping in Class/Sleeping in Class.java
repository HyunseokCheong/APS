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
    static int T;
    static int N;
    static int[] arr;
    static int maxVal, totalSum, temp, answer;
    
    static int getMaxVal() {
        maxVal = Integer.MIN_VALUE;
        totalSum = 0;
        for (int i = 0; i < N; i++) {
            maxVal = Math.max(maxVal, arr[i]);
            totalSum += arr[i];
        }
        return maxVal;
    }
    
    static boolean check(int X) {
        temp = 0;
        for (int i = 0; i < N; i++) {
            if (temp > X) {
                return false;
            }
            temp += arr[i];
            if (temp == X) {
                temp = 0;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException {
        // read
        T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            
            // solve
            maxVal = getMaxVal(); // maxVal, totalSum
            answer = 0;
            for (int i = Math.max(maxVal, 1); i < totalSum + 1; i++) {
                if (totalSum % i == 0 && check(i)) {
                    answer = N - totalSum / i;
                    break;
                }
            }
            bw.write(answer + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
}