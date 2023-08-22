class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}
