class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char target = String.valueOf(k).charAt(0);
        for (int s = i; s < j + 1; s++) {
            String string = String.valueOf(s);
            for (int l = 0; l < string.length(); l++) {
                if (target == string.charAt(l)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}