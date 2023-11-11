import java.util.Arrays;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int length = my_string.length();
        int row = length % m == 0 ? length / m : length / m + 1;
        
        char[][] board = new char[row][m];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < m; j++) {
                if (i * m + j >= length) {
                    continue;
                }
                board[i][j] = my_string.charAt(i * m + j);
            }
            answer += board[i][c - 1];
        }
        
        return answer;
    }
}