import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[] arr;
    static int[] counter;
    static long count;
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        count = 0;
        counter = new int[40001];
        for (int i = 0; i < n; i++) {
            count += counter[20000 - arr[i]];
            for (int j = 0; j < i; j++) {
                counter[20000 + arr[i] + arr[j]]++;
            }
        }
        
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}