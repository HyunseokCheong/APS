import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int h, y;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
    }
    
    static void process() throws IOException {
        int[] arr = new int[y + 1];
        arr[0] = h;
        for (int i = 1; i < y + 1; i++) {
            arr[i] = (int) (arr[i - 1] * 1.05);
            if (i >= 3) {
                arr[i] = Math.max(arr[i], (int) (arr[i - 3] * 1.2));
            }
            if (i >= 5) {
                arr[i] = Math.max(arr[i], (int) (arr[i - 5] * 1.35));
            }
        }
        bw.write(arr[y] + "\n");
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