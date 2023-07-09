class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] num_str_arr = num_str.split("");
        for (String num : num_str_arr) {
            answer += Integer.parseInt(num);
        }
        return answer;
    }
}
