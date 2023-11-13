import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[k + 1];
        for (int i = 1; i < k + 1; i++) {
            arr[i] = n * i;
            String original = String.valueOf(arr[i]);
            String reverse = "";
            for (int j = original.length() - 1; j > -1; j--) {
                reverse += original.charAt(j);
            }
            arr[i] = Integer.parseInt(reverse);
        }
        
        int result = Integer.MIN_VALUE;
        for (int a : arr) {
            result = Math.max(result, a);
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}