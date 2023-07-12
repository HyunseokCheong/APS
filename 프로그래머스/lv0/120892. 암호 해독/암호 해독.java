class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int length = cipher.length();
        for (int i = code - 1; i < length; i+= code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}
