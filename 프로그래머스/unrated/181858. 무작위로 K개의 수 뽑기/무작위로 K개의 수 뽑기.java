import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> set = new HashSet<>();
        int index = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                answer[index++] = num;
                set.add(num);
            }
            if (index >= k) {
                break;
            }
        }
        return answer;
    }
}
