class Solution {
    public int[] solution(int[] arr) {
        // 2 4 8 16 32 64 128 256 512 1024
        int[] seq = new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int n = arr.length;
        int target = -1;
        for (int i : seq) {
            if (i >= n) {
                target = i;
                break;
            }
        }
        int[] answer = new int[target];
        for (int i = 0; i < n; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}
