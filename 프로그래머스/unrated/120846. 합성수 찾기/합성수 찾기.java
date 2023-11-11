class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i < n + 1; i++) {
            // i 가 합성수인지 검사
            int count = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}