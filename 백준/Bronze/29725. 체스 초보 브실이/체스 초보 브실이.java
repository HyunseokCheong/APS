import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static Map<Character, Integer> map;
    static char[][] board;
    static int point;
    
    public static void main(String[] args) throws IOException {
        initMap();
        board = initBoard();
        point = getPoint();
        bw.write(point + "\n");
        bw.flush();
        bw.close();
    }
    
    static int getPoint() {
        char cur;
        int whitePoint = 0;
        int blackPoint = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                cur = board[i][j];
                if (cur == '.') {
                    continue;
                }
                if (Character.isUpperCase(cur)) {
                    whitePoint += map.get(cur);
                    continue;
                }
                blackPoint += map.get(cur);
            }
        }
        return whitePoint - blackPoint;
    }
    
    static char[][] initBoard() throws IOException {
        char[][] board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            board[i] = br.readLine().toCharArray();
        }
        return board;
    }
    
    static void initMap() {
        map = new HashMap<>();
        map.put('.', 0);
        map.put('K', 0);
        map.put('k', 0);
        map.put('P', 1);
        map.put('p', 1);
        map.put('N', 3);
        map.put('n', 3);
        map.put('B', 3);
        map.put('b', 3);
        map.put('R', 5);
        map.put('r', 5);
        map.put('Q', 9);
        map.put('q', 9);
    }
}