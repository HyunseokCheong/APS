class Solution {
    public String solution(String my_string) {
        String vowel = "aeiou";
        String answer = "";
        
        loop1:
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < vowel.length(); j++) {
                if (my_string.charAt(i) == vowel.charAt(j)) {
                    continue loop1;
                }
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}