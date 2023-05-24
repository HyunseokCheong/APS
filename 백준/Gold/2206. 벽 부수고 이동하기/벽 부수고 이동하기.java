import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int row, col;
    static char[][] map;

    // process
    static String input;
    static int nextRow, nextCol, nextCount;
    static int[] dr, dc;
    static boolean[][][] visited;

    static class Position {
        int i, j, count;
        boolean broken;

        public Position(int i, int j, int count, boolean broken) {
            this.i = i;
            this.j = j;
            this.count = count;
            this.broken = broken;
        }
    }

    static Position now;
    static Queue<Position> queue;

    public static void bfs() {
        queue.add(new Position(0, 0, 1, false));

        while (!queue.isEmpty()) {
            now = queue.poll();
            if (now.i == row - 1 && now.j == col - 1) {
                answer = now.count;
                return;
            }
            for (int d = 0; d < 4; d++) {
                nextRow = now.i + dr[d];
                nextCol = now.j + dc[d];

                if (nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col) continue;
                nextCount = now.count + 1;

                if (map[nextRow][nextCol] == '0') {
                    if (!now.broken && !visited[nextRow][nextCol][0]) {
                        queue.add(new Position(nextRow, nextCol, nextCount, false));
                        visited[nextRow][nextCol][0] = true;
                    } else if (now.broken && !visited[nextRow][nextCol][1]) {
                        queue.add(new Position(nextRow, nextCol, nextCount, true));
                        visited[nextRow][nextCol][1] = true;
                    }
                } else if (map[nextRow][nextCol] == '1') {
                    if (!now.broken) {
                        queue.add(new Position(nextRow, nextCol, nextCount, true));
                        visited[nextRow][nextCol][1] = true;
                    }
                }
            }
        }
        answer = -1;
    }

    // write
    static int answer;

    public static void main(String[] args) throws IOException {
        // read
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new char[row][col];
        for (int r = 0; r < row; r++) {
            input = br.readLine();
            for (int c = 0; c < col; c++) {
                map[r][c] = input.charAt(c);
            }
        }

        // process
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        visited = new boolean[row][col][2];
        queue = new LinkedList<>();
        bfs();

        // write
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}