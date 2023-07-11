class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int[] answer = new int[length];
        for (int i = 0; i < length; i++) {
            int cur = arr[i];
            if (cur >= 50 && cur % 2 == 0) {
                answer[i] = cur / 2;
            } else if (cur < 50 && cur % 2 != 0) {
                answer[i] = cur * 2;
            } else {
                answer[i] = cur;
            }
        }
        return answer;
    }
}