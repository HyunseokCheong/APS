import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, maxCount, maxIdx, count;
    static int[] arr, answer;
    static boolean[] visited;
    
    static void dfs(int idx) {
        visited[idx] = true;
        while (!visited[arr[idx]]) {
            dfs(arr[idx]);
        }
    }
    
    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        maxCount = 0;
        maxIdx = 0;
        answer = new int[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(visited, false);
            count = 0;
            dfs(i);
            for (int j = 1; j <= n; j++) {
                if (visited[j]) {
                    count++;
                }
            }
            answer[i] = count;
            if (count > maxCount) {
                maxCount = count;
                maxIdx = i;
            }
        }
        
        bw.write(maxIdx + "\n");
        bw.flush();
        bw.close();
    }
}