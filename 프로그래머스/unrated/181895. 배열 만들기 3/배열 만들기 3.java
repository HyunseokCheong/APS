import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : intervals) {
            for (int i = ints[0]; i < ints[1] + 1; i++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
