import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("a", "A").replaceAll("b", "A").replaceAll("c", "A");
        String[] split = myStr.split("A");
        split = Arrays.stream(split).filter(s -> !s.isEmpty()).toArray(String[]::new);
        if (split.length == 0) {
            return new String[]{"EMPTY"};
        }
        return split;
    }
}
