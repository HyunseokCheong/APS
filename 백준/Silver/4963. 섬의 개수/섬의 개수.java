import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // declare
    static int W, H;
    static int[][] arr;
    
    // 상 우상 좌상 하 우하 좌하 우 좌
    static int[] cur,
            dh = {-1, -1, -1, 1, 1, 1, 0, 0},
            dw = {0, 1, -1, 0, 1, -1, 1, -1};
    static int curH, curW, nextH, nextW;
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] visited;
    static int countLand;
    
    public static void main(String[] args) throws IOException {
        // read
        while (true) {
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if (W == 0 && H == 0) {
                break;
            }
            arr = new int[H][W];
            visited = new boolean[H][W];
            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            
            countLand = 0;
            for (int h = 0; h < H; h++) {
                for (int w = 0; w < W; w++) {
                    if (arr[h][w] == 1 && !visited[h][w]) {
                        BFS(h, w);
                        countLand++;
                    }
                }
            }
            bw.write(countLand + "\n");
        }
        
        // write
        bw.flush();
        bw.close();
    }
    
    static void BFS(int h, int w) {
        queue.add(new int[]{h, w});
        visited[h][w] = true;
        
        while (!queue.isEmpty()) {
            cur = queue.poll();
            curH = cur[0];
            curW = cur[1];
            
            for (int i = 0; i < 8; i++) {
                nextH = curH + dh[i];
                nextW = curW + dw[i];
                
                if (!isOk(nextH, nextW)) {
                    continue;
                }
                
                queue.add(new int[]{nextH, nextW});
                visited[nextH][nextW] = true;
            }
        }
    }
    
    static boolean isOk(int nextH, int nextW) {
        if (nextW < 0 || nextW >= W || nextH < 0 || nextH >= H) {
            return false;
        }
        if (visited[nextH][nextW]) {
            return false;
        }
        if (arr[nextH][nextW] == 0) {
            return false;
        }
        return true;
    }
}