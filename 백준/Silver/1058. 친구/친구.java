import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static char[] line;
    static int[][] dist;
    static final int INF = Integer.MAX_VALUE;
    
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        dist = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            line = br.readLine().toCharArray();
            for (int j = 1; j < n + 1; j++) {
                if (line[j - 1] == 'Y') {
                    dist[i][j] = 1;
                    continue;
                }
                dist[i][j] = INF;
            }
            dist[i][i] = 0;
        }
    }
    
    static void process() throws IOException {
        for (int k = 1; k < n + 1; k++) {
            for (int i = 1; i < n + 1; i++) {
                for (int j = 1; j < n + 1; j++) {
                    if (dist[i][k] == INF || dist[k][j] == INF) {
                        continue;
                    }
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        int max = 0, count;
        for (int i = 1; i < n + 1; i++) {
            count = 0;
            for (int j = 1; j < n + 1; j++) {
                if (dist[i][j] == 2 || dist[i][j] == 1) {
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        bw.write(max + "\n");
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