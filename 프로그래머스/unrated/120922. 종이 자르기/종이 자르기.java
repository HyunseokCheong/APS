class Solution {
    public int solution(int M, int N) {
        int l = Math.max(M, N);
        int s = Math.min(M, N);
        
        int answer = 0;
        answer += s - 1;
        answer += (l - 1) * s;
        return answer;
    }
}