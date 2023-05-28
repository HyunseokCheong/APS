class Solution {
    public int solution(int n, int k) {
        // 12000, 2000
        
        // food
        int answer = 0;
        answer += n * 12000;
        
        // free drink
        int free = 0;
        free = n / 10;
        k -= free;
        
        // answer
        answer += k * 2000;
        return answer;
    }
}