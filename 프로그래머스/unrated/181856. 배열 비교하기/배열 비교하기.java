class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        
        if (length1 == length2) {
            int sum1 = 0;
            int sum2 = 0;
            
            for (int i = 0; i < length1; i++) {
                sum1 += arr1[i];
            }
            for (int i = 0; i < length1; i++) {
                sum2 += arr2[i];
            }
            
            if (sum1 == sum2) {
                return 0;
            } else if (sum1 > sum2) {
                return 1;
            } else {
                return -1;
            }
        }
        
        if (length1 > length2) {
            return 1;
        } else {
            return -1;
        }
    }
}