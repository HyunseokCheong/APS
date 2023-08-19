import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int n = array.length;
        int answer = array[n / 2];
        return answer;
    }
}