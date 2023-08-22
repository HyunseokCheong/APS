class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] bowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                continue;
            }
            answer += c;
        }
        return answer;
    }
}