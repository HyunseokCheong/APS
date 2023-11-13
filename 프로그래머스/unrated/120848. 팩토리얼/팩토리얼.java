class Solution {
    public int solution(int n) {
        int[] arr = new int[11];
        arr[1] = 1;
        for (int i = 2; i < 11; i++) {
            arr[i] = arr[i - 1] * i;
        }
        for (int i = 10; i > -1; i--) {
            if (arr[i] <= n) {
                return i;
            }
        }
        return 0;
    }
}