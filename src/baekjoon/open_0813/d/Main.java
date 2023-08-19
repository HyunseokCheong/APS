package baekjoon.open_0813.d;

import java.io.*;
import java.util.*;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int K;
    static int maxScore = Integer.MIN_VALUE;
    static boolean[] visited;
    static int[][] board;
    
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        board = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        visited = new boolean[N];
        recur(0, new ArrayList<>());
        bw.write(maxScore + "\n");
        bw.flush();
        bw.close();
    }
    
    static void recur(int depth, List<Integer> coordinates) {
        if (depth == K) {
            maxScore = Math.max(maxScore, getScore(coordinates));
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            coordinates.add(i);
            recur(depth + 1, coordinates);
            coordinates.remove(coordinates.size() - 1);
            visited[i] = false;
        }
    }
    
    static Integer getScore(List<Integer> coordinates) {
        int score = 0;
        int length = coordinates.size();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i < j) {
                    score += board[coordinates.get(i)][coordinates.get(j)];
                }
            }
        }
        
        return score;
    }
}
