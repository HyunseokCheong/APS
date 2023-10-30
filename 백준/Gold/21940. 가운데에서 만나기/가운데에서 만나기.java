import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n, m, k;
    static final int INF = Integer.MAX_VALUE;
    static int[][] dist;
    static ArrayList<Integer> cities;
    
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }
        
        int a, b, t;
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            t = Integer.parseInt(st.nextToken());
            dist[a - 1][b - 1] = Math.min(dist[a - 1][b - 1], t);
        }
        
        k = Integer.parseInt(br.readLine());
        cities = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            cities.add(Integer.parseInt(st.nextToken()));
        }
    }
    
    static void process() throws IOException {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] == INF || dist[k][j] == INF) {
                        continue;
                    }
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        
        int[] max = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (Integer city : cities) {
                max[i] = Math.max(max[i], dist[city - 1][i] + dist[i][city - 1]);
            }
            min = Math.min(min, max[i]);
        }
        
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (min >= max[i]) {
                results.add(i + 1);
            }
        }
        Collections.sort(results);
        for (int result : results) {
            bw.write(result + " ");
        }
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