class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start - end + 1];
        // 10 9 8 7 6 5 4 3
        // 0  1 2 3 4 5 6 7
        for (int i = 0; i < start - end + 1; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}