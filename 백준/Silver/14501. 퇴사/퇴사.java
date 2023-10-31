import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, maxValue;
    static int[][] arr;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
    }
    
    static void recur(int index, int value) {
        if (index == n) {
            maxValue = Math.max(maxValue, value);
            return;
        }
        if (index + arr[index][0] <= n) {
            recur(index + arr[index][0], value + arr[index][1]);
        }
        recur(index + 1, value);
    }
    
    static void process() throws IOException {
        maxValue = 0;
        recur(0, 0);
        bw.write(maxValue + "\n");
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