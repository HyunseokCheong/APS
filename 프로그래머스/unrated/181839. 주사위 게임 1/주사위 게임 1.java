class Solution {
    public int solution(int a, int b) {
        int oddScore = 0;
        if (a % 2 != 0) {
            oddScore++;
        }
        if (b % 2 != 0) {
            oddScore++;
        }
        
        
        int answer = 0;
        if (oddScore == 2) {
            answer = a * a + b * b;
        } else if (oddScore == 1) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        
        return answer;
    }
}