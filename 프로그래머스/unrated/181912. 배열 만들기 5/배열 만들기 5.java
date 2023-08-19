import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for (String intStr : intStrs) {
            String sub = intStr.substring(s, s + l);
            int intSub = Integer.parseInt(sub);
            if (intSub > k) {
                list.add(intSub);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}