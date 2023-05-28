class Solution {
    public int solution(int[] array, int height) {
        int n = array.length;
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}