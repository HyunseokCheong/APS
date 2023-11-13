class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String reverse = my_string.substring(s, e + 1);
        int index = e - s;
        for (int i = 0; i < my_string.length(); i++) {
            if (i >= s && i <= e) {
                answer += reverse.charAt(index--);
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}