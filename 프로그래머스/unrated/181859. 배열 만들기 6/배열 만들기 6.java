import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        List<Integer> numbers = new ArrayList<>();
        while(i < arr.length) {
            if (numbers.isEmpty()) {
                numbers.add(arr[i]);
                i++;
                continue;
            }
            if (!numbers.isEmpty() && numbers.get(numbers.size() - 1) == arr[i]) {
                numbers.remove(numbers.size() - 1);
                i++;
                continue;
            }
            if (!numbers.isEmpty() && numbers.get(numbers.size() - 1) != arr[i]) {
                numbers.add(arr[i]);
                i++;
            }
        }
        if (numbers.isEmpty()) {
            return new int[]{-1};
        }
        int[] result = new int[numbers.size()];
        for (int j = 0; j < numbers.size(); j++) {
            result[j] = numbers.get(j);
        }
        return result;
    }
}