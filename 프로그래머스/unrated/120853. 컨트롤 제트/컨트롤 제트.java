class Solution {
    public int solution(String s) {
        int answer = 0;
        int pre = 0;
        String[] split = s.split(" ");
        for (String string : split) {
            if (string.equals("Z")) {
                answer -= pre;
            }
            if (!string.equals("Z")) {
                int number = Integer.parseInt(string);
                answer += number;
                pre = number;
            }
        }
        return answer;
    }
}