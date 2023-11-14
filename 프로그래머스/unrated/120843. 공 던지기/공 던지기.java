class Solution {
    public int solution(int[] numbers, int k) {
        int cur = 0;
        while (k-- > 1) {
	        cur = (cur + 2) % numbers.length;
        }
        return numbers[cur];
    }
}