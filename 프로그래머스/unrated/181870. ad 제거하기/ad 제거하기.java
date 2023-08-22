import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (str.contains("ad")) {
                continue;
            }
            list.add(str);
        }
        return list.toArray(String[]::new);
    }
}