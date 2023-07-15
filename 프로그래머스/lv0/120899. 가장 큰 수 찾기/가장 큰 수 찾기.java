class Solution {
    public int[] solution(int[] array) {
        int max = -1;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
        }
        int[] answer = new int[2];
        answer[0] = max;
        answer[1] = maxIndex;
        return answer;
    }
}