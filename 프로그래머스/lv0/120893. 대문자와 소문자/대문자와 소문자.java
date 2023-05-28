class Solution {
    
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[]        array  = my_string.toCharArray();
        
        String temp = "";
        for (char c : array) {
            if (c >= 97 && c <= 122) {
                temp = String.valueOf(c);
                answer.append(temp.toUpperCase());
            } else if (c >= 65 && c <= 90) {
                temp = String.valueOf(c);
                answer.append(temp.toLowerCase());
            }
        }
        return answer.toString();
    }
}