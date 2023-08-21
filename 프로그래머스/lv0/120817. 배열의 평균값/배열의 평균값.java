class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int length = numbers.length;
        for (int number : numbers) {
            answer += number;
        }
        return answer / length;
    }
}