class Solution {
    public String solution(String s) {
        int[] check = new int[26];
        for (char c : s.toCharArray()) {
            check[c - 'a']++;
        }
        String answer = "";
        for (int i = 0; i < 26; i++) {
            if (check[i] == 1) {
				answer += (char) (i + 'a');
            }
        }
        return answer;
    }
}