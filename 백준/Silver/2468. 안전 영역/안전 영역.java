import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int n;
    static int[][] map;

    // process
    static int rainHeight, currentCount, maxLoop, nextRow, nextCol;
    static int[] dr, dc, currentPosition;
    static boolean[][] visited;
    static Queue<int[]> queue;

    // write
    static int maxCount;

    public static void main(String[] args) throws IOException {
        // read
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        maxLoop = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxLoop = Math.max(maxLoop, map[i][j]);
            }
        }
        maxCount = Integer.MIN_VALUE;
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        for (rainHeight = 0; rainHeight <= maxLoop; rainHeight++) {
            queue = new LinkedList<>();
            visited = new boolean[n][n];
            currentCount = 0;

            // process
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (map[i][j] > rainHeight && !visited[i][j]) {
                        queue.add(new int[]{i, j});
                        visited[i][j] = true;
                        currentCount++;
                        while (!queue.isEmpty()) {
                            currentPosition = queue.poll();
                            for (int k = 0; k < 4; k++) {
                                nextRow = currentPosition[0] + dr[k];
                                nextCol = currentPosition[1] + dc[k];
                                if (nextRow >= 0 && nextRow < n && nextCol >= 0 && nextCol < n) {
                                    if (map[nextRow][nextCol] > rainHeight && !visited[nextRow][nextCol]) {
                                        queue.add(new int[]{nextRow, nextCol});
                                        visited[nextRow][nextCol] = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            maxCount = Math.max(maxCount, currentCount);
        }

        // write
        bw.write(maxCount + "\n");
        bw.flush();
        bw.close();
    }
}