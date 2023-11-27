class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        loop1:
        for (int i = 0; i < myString.length() - pat.length() + 1; i++) {
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    continue loop1;
                }
            }
            answer++;
        }
        return answer;
    }
}