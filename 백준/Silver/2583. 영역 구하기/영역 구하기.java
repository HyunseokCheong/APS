import java.io.*;
import java.util.*;

public class Main {
    // read
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int row, col, n, startRow, startCol, endRow, endCol;

    // process
    static int nextRow, nextCol;
    static int[] curPos, dr, dc;
    static boolean[][] map;
    static Queue<int[]> queue;

    // write
    static int answer;
    static int[] answerArr;

    public static void main(String[] args) throws IOException {
        // read
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        queue = new LinkedList<>();

        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new boolean[row][col];

        n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            startCol = Integer.parseInt(st.nextToken());
            startRow = Integer.parseInt(st.nextToken());
            endCol = Integer.parseInt(st.nextToken());
            endRow = Integer.parseInt(st.nextToken());

            for (int r = startRow; r < endRow; r++) {
                for (int c = startCol; c < endCol; c++) {
                    map[r][c] = true;
                }
            }
        }

        // process
        answer = 0;
        answerArr = new int[10000];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (!map[r][c]) {
                    bfs(r, c);
                    answer++;
                }
            }
        }
        Arrays.sort(answerArr, 0, answer);

        // write
        bw.write(answer + "\n");
        for (int i = 0; i < answer; i++) bw.write(answerArr[i] + " ");
        bw.flush();
        bw.close();
    }

    public static void bfs(int r, int c) {
        queue.add(new int[]{r, c});
        map[r][c] = true;
        answerArr[answer]++;

        while (!queue.isEmpty()) {
            curPos = queue.poll();
            for (int i = 0; i < 4; i++) {
                nextRow = curPos[0] + dr[i];
                nextCol = curPos[1] + dc[i];

                if (nextRow < 0 || nextRow >= row || nextCol < 0 || nextCol >= col) continue;
                if (map[nextRow][nextCol]) continue;

                queue.add(new int[]{nextRow, nextCol});
                map[nextRow][nextCol] = true;
                answerArr[answer]++;
            }
        }
    }
}