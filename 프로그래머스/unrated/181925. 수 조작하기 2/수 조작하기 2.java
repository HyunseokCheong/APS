class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i = 1; i < numLog.length; i++) {
            int result = numLog[i] - numLog[i - 1];
            String operator = result == 1 ? "w" : result == -1 ? "s" : result == 10 ? "d" : "a";
            answer += operator;
        }
        return answer;
    }
}