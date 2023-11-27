import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int a : array) {
            if (Math.abs(n - a) < min) {
                min = Math.abs(n - a);
                answer = a;
            }
        }
        return answer;
    }
}