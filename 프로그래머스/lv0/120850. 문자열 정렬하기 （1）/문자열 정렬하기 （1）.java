import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int lengthOfNumber = 0;
        int lengthOfString = my_string.length();
        for (int i = 0; i < lengthOfString; i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                lengthOfNumber++;
            }
        }
        int[] result = new int[lengthOfNumber];
        int index = 0;
        for (int i = 0; i < lengthOfString; i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                result[index] = my_string.charAt(i) - '0';
                index++;
            }
        }
        Arrays.sort(result);
        return result;
    }
}