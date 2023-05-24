class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.toString(my_string.charAt(i)).equals(alp)) {
                answer += alp.toUpperCase();
            } else {
                answer += Character.toString(my_string.charAt(i));
            }
        }
        
        return answer;
    }
}