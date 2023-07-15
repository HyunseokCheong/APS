class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i : num_list) {
            answer += solve(i);
        }
        
        return answer;
    }
    
    public static int solve(int n) {
        int count = 0;
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n - 1) / 2;
            }
            count++;
        }
        
        return count;
    }
}