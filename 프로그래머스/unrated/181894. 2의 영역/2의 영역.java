class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int start = -1;
        int end = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        if (start == -1 && end == -1) {
            return new int[]{-1};
        }
        int length = end - start + 1;
        int[] answer = new int[length];
        for (int i = start; i < end + 1; i++) {
            answer[i - start] = arr[i];
        }
        return answer;
    }
}
