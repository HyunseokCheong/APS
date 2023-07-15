import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int num1 : arr) {
            boolean flag = false;
            for (int num2 : delete_list) {
                if (num1 == num2) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                list.add(num1);
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
