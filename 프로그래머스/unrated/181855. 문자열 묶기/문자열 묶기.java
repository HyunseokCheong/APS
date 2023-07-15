class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] count = new int[31];
        for (String s : strArr) {
            count[s.length()]++;
            answer = Math.max(answer, count[s.length()]);
        }
        return answer;
    }
}