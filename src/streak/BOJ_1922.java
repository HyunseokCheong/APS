package streak;

import java.io.*;
import java.util.*;

public class BOJ_1922 {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int N, M;
    static int[] arr;
    static int[][] networks;
    static int result;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = i;
        }
        networks = new int[M][3];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            networks[i][0] = Integer.parseInt(st.nextToken());
            networks[i][1] = Integer.parseInt(st.nextToken());
            networks[i][2] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(networks, Comparator.comparingInt(o -> o[2]));
        result = 0;
        for (int[] network : networks) {
            if (union(network[0], network[1])) {
                result += network[2];
            }
        }
        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
    
    static int find(int x) {
        if (x == arr[x]) {
            return x;
        }
        return arr[x] = find(arr[x]);
    }
    
    static boolean union(int from, int to) {
        int a = find(from);
        int b = find(to);
        if (a != b) {
            arr[a] = b;
            return true;
        }
        return false;
    }
}
