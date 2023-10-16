import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int k;
    static int[] arr, result;
    static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if (k == 0) {
                break;
            }
            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            result = new int[6];
            visited = new boolean[k];
            recur(0, 0);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
    
    static void recur(int depth, int start) throws IOException {
        if (depth == 6) {
            for (int num : result) {
                bw.write(num + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i = start; i < k; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                recur(depth + 1, i);
                visited[i] = false;
            }
        }
    }
}