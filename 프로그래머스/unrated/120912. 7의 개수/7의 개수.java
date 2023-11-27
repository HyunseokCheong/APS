class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int a : array) {
            String[] sArr = String.valueOf(a).split("");
            for (String s : sArr) {
                if ("7".equals(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}