class Solution {
    public String solution(String myString) {
        // l 60
        String answer = "";
        for (char c : myString.toCharArray()) {
            if (c - '0' < 60) {
                answer += 'l';
            } else {
                answer += c;
            }
        }
        return answer;
    }
}
