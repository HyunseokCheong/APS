class Solution {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length / n;
        int col = n;
        int[][] answer = new int[row][col];
        int index = 0;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                answer[r][c] = num_list[index++];
            }
        }
        return answer;
    }
}