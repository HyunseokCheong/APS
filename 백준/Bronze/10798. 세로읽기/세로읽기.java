import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    static char[][] board;
    static String result;

    public static void main(String[] args) throws IOException {
        board = new char[5][15];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(board[i], '-');
            char[] input = br.readLine().toCharArray();
            for (int j = 0; j < input.length; j++) {
                board[i][j] = input[j];
            }
        }

        result = "";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[j][i] == '-') {
                    continue;
                }
                result += board[j][i];
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}