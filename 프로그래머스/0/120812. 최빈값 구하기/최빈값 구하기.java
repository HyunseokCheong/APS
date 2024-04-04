class Solution {
    public int solution(int[] array) {
        int maxNum = 0;
        int maxCnt = 0;
        int[] counter = new int[1001];
        for (int num : array) {
            counter[num]++;
        }
        
        for (int i = 0; i < 1001; i++) {
            if (counter[i] > maxCnt) {
                maxCnt = counter[i];
                maxNum = i;
            } else if (counter[i] == maxCnt) {
                maxNum = -1;
            }
        }
        
        return maxNum;
    }
}