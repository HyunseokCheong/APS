import java.util.Arrays;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        Arrays.sort(indices);
        int n = my_string.length();
        boolean[] check = new boolean[n];
        for (int i : indices) {
            check[i] = true;
        }
        for (int i = 0; i < n; i++) {
            if (check[i]) {
                continue;
            }
            answer += my_string.charAt(i);
        }
        return answer;
    }
}