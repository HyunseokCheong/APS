class Solution {
    /**
     * answer: i + j <= k인 board[i][j]의 합
     *
     * @param board int[][]
     * @param k     int
     * @return answer int
     */
    public int solution(int[][] board, int k) {
        int answer = 0;
        int n = board.length;
        for(int i = 0; i < n; i++) {
            int m = board[i].length;
            for(int j = 0; j < m; j++) {
                if(i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
