class Solution {
    public int[] solution(int[] arr) {
        int length1 = arr.length;
        int length2 = 0;
        
        for (int i = 0; i < length1; i++) {
            length2 += arr[i];
        }
        
        int[] answer = new int[length2];
        int index = 0;
        for (int i = 0; i < length1; i++) {
            int cur = arr[i];
            for (int j = 0; j < cur; j++) {
                answer[index] = cur;
                index++;
            }
        }
        
        return answer;
    }
}
