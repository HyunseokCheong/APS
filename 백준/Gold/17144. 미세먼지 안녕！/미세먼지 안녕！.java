import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
    // declare
    static BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    
    static int rowOfRoom, colOfRoom, time, quantityOfDiffusion, countOfDiffusion, nextRow, nextCol;
    static int cleanerRow = -1;
    static int answer;
    
    static int[] dr = {-1, 1, 0, 0}, dc = {0, 0, -1, 1};
    static int[][]         room;
    static boolean[][]     visited;
    static Queue<FineDust> fineDustQueue;
    
    static class FineDust {
        
        int row;
        int col;
        int quantityOfFineDust;
        
        public FineDust(int row, int col, int quantityOfFineDust) {
            this.row                = row;
            this.col                = col;
            this.quantityOfFineDust = quantityOfFineDust;
        }
    }
    
    public static void main(String[] args) throws IOException {
        // read
        st        = new StringTokenizer(br.readLine());
        rowOfRoom = Integer.parseInt(st.nextToken());
        colOfRoom = Integer.parseInt(st.nextToken());
        time      = Integer.parseInt(st.nextToken());
        room      = new int[rowOfRoom][colOfRoom];
        
        for (int r = 0; r < rowOfRoom; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < colOfRoom; c++) {
                room[r][c] = Integer.parseInt(st.nextToken());
                
                if (cleanerRow == -1 && room[r][c] == -1) {
                    cleanerRow = r;
                }
            }
        }
        
        while (time-- > 0) {
            
            checkFineDust();
            spreadFineDust();
            removeFineDust();
        }
        
        answer = 0;
        for (int r = 0; r < rowOfRoom; r++) {
            for (int c = 0; c < colOfRoom; c++) {
                if (room[r][c] == -1) {
                    continue;
                }
                answer += room[r][c];
            }
        }
        
        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
    
    static void checkFineDust() {
        fineDustQueue = new LinkedList<>();
        
        for (int r = 0; r < rowOfRoom; r++) {
            for (int c = 0; c < colOfRoom; c++) {
                if (room[r][c] == -1 || room[r][c] == 0) {
                    continue;
                }
                fineDustQueue.add(new FineDust(r, c, room[r][c]));
            }
        }
    }
    
    private static void spreadFineDust() {
        while (!fineDustQueue.isEmpty()) {
            FineDust fineDust = fineDustQueue.poll();
            
            if (fineDust.quantityOfFineDust < 5) {
                continue;
            }
            
            quantityOfDiffusion = fineDust.quantityOfFineDust / 5;
            countOfDiffusion    = 0;
            
            for (int direction = 0; direction < 4; direction++) {
                nextRow = fineDust.row + dr[direction];
                nextCol = fineDust.col + dc[direction];
                
                if (nextRow < 0 || nextRow >= rowOfRoom || nextCol < 0 || nextCol >= colOfRoom) {
                    continue;
                }
                
                if (room[nextRow][nextCol] == -1) {
                    continue;
                }
                
                room[nextRow][nextCol] += quantityOfDiffusion;
                countOfDiffusion++;
            }
            room[fineDust.row][fineDust.col] -= quantityOfDiffusion * countOfDiffusion;
        }
    }
    
    private static void removeFineDust() {
        int top  = cleanerRow;
        int down = cleanerRow + 1;
        
        for (int i = top - 1; i > 0; i--) {
            room[i][0] = room[i - 1][0];
        }
        
        for (int i = 0; i < colOfRoom - 1; i++) {
            room[0][i] = room[0][i + 1];
        }
        
        for (int i = 0; i < top; i++) {
            room[i][colOfRoom - 1] = room[i + 1][colOfRoom - 1];
        }
        
        for (int i = colOfRoom - 1; i > 1; i--) {
            room[top][i] = room[top][i - 1];
        }
        
        room[top][1] = 0;
        
        for (int i = down + 1; i < rowOfRoom - 1; i++) {
            room[i][0] = room[i + 1][0];
        }
        
        for (int i = 0; i < colOfRoom - 1; i++) {
            room[rowOfRoom - 1][i] = room[rowOfRoom - 1][i + 1];
        }
        
        for (int i = rowOfRoom - 1; i > down; i--) {
            room[i][colOfRoom - 1] = room[i - 1][colOfRoom - 1];
        }
        
        for (int i = colOfRoom - 1; i > 1; i--) {
            room[down][i] = room[down][i - 1];
        }
        
        room[down][1] = 0;
    }
}