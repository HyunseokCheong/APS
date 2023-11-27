class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length();
        int row = length % n == 0 ? length / n : length / n + 1;
        String[] answer = new String[row];
        for (int i = 0; i < row; i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if ((i * n) + j >= length) {
                    continue;
                }
                s += my_str.charAt((i * n) + j);
            }
            answer[i] = s;
        }
        
        return answer;
    }
}