class Solution {
    public String solution(String my_string) {
        String answer = "";
        // 17 42 49 74 -16
        boolean[] isUsed = new boolean[91]; // A ~ Z, a ~ z, " "
        for (char c : my_string.toCharArray()) {
            if (isUsed[c - '0' + 16]) {
                continue;
            }
            isUsed[c - '0' + 16] = true;
            answer += c;
        }
        return answer;
    }
}
