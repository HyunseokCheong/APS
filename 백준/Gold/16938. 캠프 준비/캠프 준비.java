import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, l, r, x;
    static int[] arr;
    static int result;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void recur(int index, int depth, int sum, int maxValue, int minValue) {
        if (depth >= 2 && sum >= l && sum <= r && maxValue - minValue >= x) {
            result++;
        }
        for (int i = index; i < n; i++) {
            recur(i + 1, depth + 1, sum + arr[i], Math.max(maxValue, arr[i]), Math.min(minValue, arr[i]));
        }
    }
    
    static void process() throws IOException {
        result = 0;
        Arrays.sort(arr);
        recur(0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        bw.write(result + "\n");
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