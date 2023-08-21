import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}