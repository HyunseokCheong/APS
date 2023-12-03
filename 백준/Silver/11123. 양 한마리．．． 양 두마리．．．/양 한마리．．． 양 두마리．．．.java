import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int testCase, h, w;
    static char[][] board;
    static boolean[][] visited;
    static final int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상, 하, 좌, 우 방향
    static Queue<int[]> queue;
    
    // 입력 처리 함수
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        board = new char[h][w];
        for (int i = 0; i < h; i++) {
            board[i] = br.readLine().toCharArray();
        }
    }
    
    static void process() throws IOException {
        int result = 0;
        visited = new boolean[h][w];
        queue = new LinkedList<>();
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == '#' && !visited[i][j]) { // 탐색 대상 발견
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        for (int d = 0; d < 4; d++) {
                            int nr = cur[0] + dir[d][0];
                            int nc = cur[1] + dir[d][1];
                            if (nr < 0 || nr >= h || nc < 0 || nc >= w) { // 격자 범위 체크
                                continue;
                            }
                            if (visited[nr][nc] || board[nr][nc] == '.') { // 방문 여부 및 탐색 대상 여부 체크
                                continue;
                            }
                            queue.add(new int[]{nr, nc});
                            visited[nr][nc] = true;
                        }
                    }
                    result++; // 하나의 그룹 탐색 완료
                }
            }
        }
        bw.write(result + "\n");
    }
    
    // 출력 처리 함수
    static void output() throws IOException {
        bw.flush();
        bw.close();
    }
    
    public static void main(String[] args) throws IOException {
        testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            input();
            process();
        }
        output();
    }
}