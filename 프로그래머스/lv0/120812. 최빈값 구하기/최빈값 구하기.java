class Solution {
    public int solution(int[] array) {
        // 횟수 배열에 저장
        int[] count = new int[1001];
        for (int i : array) {
            count[i]++;
        }
        
        // 가장 많이 나온 수 저장
        int max = 0;
        int maxCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                max = i;
                maxCount = count[i];
            }
        }
        
        // 가장 많이 나온 수 여러개 인지 확인
        int maxCountCount = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                maxCountCount++;
            }
        }
        
        // 여러개: -1
        if (maxCountCount > 1) {
            return -1;
        }
        
        // 아니면: 가장 많이 나온 수 리턴
        return max;
    }
}
