import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] split = myString.split("x");
        for (String s : split) {
            if (!s.equals("")) {
                list.add(s);
            }
        }
        return list.stream().sorted().toArray(String[]::new);
    }
}
