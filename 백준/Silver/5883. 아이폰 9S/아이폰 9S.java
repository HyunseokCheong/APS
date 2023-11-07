import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] arr;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }
    
    static void process() throws IOException {
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int skipValue = arr[i];
            maxLength = Math.max(maxLength, getMaxLength(skipValue));
        }
        bw.write(maxLength + "\n");
    }
    
    static int getMaxLength(int skipValue) {
        int pre = arr[0];
        int count = 1;
        int max = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] == skipValue) {
                continue;
            }
            if (arr[i] != pre) {
                count = 1;
            }
            if (arr[i] == pre) {
                count++;
                max = Math.max(max, count);
            }
            pre = arr[i];
        }
        return max;
    }
    
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
}