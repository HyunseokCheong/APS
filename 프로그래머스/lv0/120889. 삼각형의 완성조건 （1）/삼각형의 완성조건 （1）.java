class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        
        for (int i = 0; i < sides.length; i++) {
            sum += sides[i];
            maxNumber = Math.max(maxNumber, sides[i]);
        }
        
        if (sum - maxNumber <= maxNumber) {
            answer = 2;
        }
        
        return answer;
    }
}