import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static int row, col, answer, nowR, nowC, nextR, nextC;
    static int land, count;
    static int[] now, dr, dc;
    static int[][] map, visited, meltMap;
    static Queue<int[]> queue;


    static void read() throws IOException {
        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());
        map = new int[row][col];
        for (int r = 0; r < row; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < col; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
    }

    static void solve() throws IOException {
        answer = 0;
        dr = new int[]{-1, 1, 0, 0};
        dc = new int[]{0, 0, -1, 1};
        queue = new LinkedList<>();

        while (true) {
            // 종료 조건 : 전부 녹았거나, 빙산이 2개 이상이거나
            if (isAllMelt()) {
                answer = 0; // 모두 녹았는데 빙산 분리 안되는 경우
                break;
            }
            if (isTwoOrMore()) break;

            // 녹이기
            melt();
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    static boolean isAllMelt() {
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (map[r][c] != 0) return false;
            }
        }
        return true;
    }

    static boolean isTwoOrMore() {
        land = 0;
        visited = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (map[r][c] != 0 && visited[r][c] == 0) {
                    land++;
                    if (land > 1) return true;
                    queue.add(new int[]{r, c});
                    visited[r][c] = 1;
                    while (!queue.isEmpty()) {
                        now = queue.poll();
                        nowR = now[0];
                        nowC = now[1];
                        for (int i = 0; i < 4; i++) {
                            nextR = nowR + dr[i];
                            nextC = nowC + dc[i];
                            if (nextR < 0 || nextR >= row || nextC < 0 || nextC >= col) continue;
                            if (map[nextR][nextC] != 0 && visited[nextR][nextC] == 0) {
                                queue.add(new int[]{nextR, nextC});
                                visited[nextR][nextC] = 1;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static void melt() {
        meltMap = new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (map[r][c] != 0) {
                    count = 0;
                    for (int i = 0; i < 4; i++) {
                        nextR = r + dr[i];
                        nextC = c + dc[i];
                        if (nextR < 0 || nextR >= row || nextC < 0 || nextC >= col) continue;
                        if (map[nextR][nextC] == 0) count++;
                    }
                    meltMap[r][c] = count;
                }
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                map[r][c] -= meltMap[r][c];
                if (map[r][c] < 0) map[r][c] = 0;
            }
        }
        answer++;
    }

    public static void main(String[] args) throws IOException {
        read();
        solve();
    }
}