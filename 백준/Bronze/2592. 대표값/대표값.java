import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int sum;
    static int[] arr;
    
    public static void main(String[] args) throws IOException {
        sum = 0;
        arr = new int[1000];
        for (int i = 0; i < 10; i++) {
            int input = Integer.parseInt(br.readLine());
            sum += input;
            arr[input]++;
        }
        int maxValue = 0;
        int maxCount = 0;
        for (int i = 0; i < 1000; i++) {
            if (arr[i] > maxCount) {
                maxValue = i;
                maxCount = arr[i];
            }
        }
        
        bw.write(sum / 10 + "\n" + maxValue + "\n");
        bw.flush();
        bw.close();
    }
}