class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int key : array) {
            if (key > height) {
                answer++;
            }
        }
        return answer;
    }
}