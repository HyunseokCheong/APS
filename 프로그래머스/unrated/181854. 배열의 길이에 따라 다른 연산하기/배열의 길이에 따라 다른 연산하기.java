class Solution {
    public int[] solution(int[] arr, int n) {
        int lengthOfArr = arr.length;
        
        if (lengthOfArr % 2 != 0) {
            for (int i = 0; i < lengthOfArr; i++) {
                if (i % 2 == 0) {
                    arr[i] += n;
                }
            }
        } else {
            for (int i = 0; i < lengthOfArr; i++) {
                if (i % 2 != 0) {
                    arr[i] += n;
                }
            }
        }
        return arr;
    }
}