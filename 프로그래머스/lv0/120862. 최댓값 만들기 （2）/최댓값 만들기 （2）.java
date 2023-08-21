class Solution {
    public int solution(int[] numbers) {
        int answer = -100000001;
        int n = numbers.length;
        for (int i = 0; i < n-1; i++){
            for (int j = i + 1; j < n; j++ ){
                answer = Math.max(answer, numbers[i] * numbers[j]);
            }
        }
        return answer;
    }
}