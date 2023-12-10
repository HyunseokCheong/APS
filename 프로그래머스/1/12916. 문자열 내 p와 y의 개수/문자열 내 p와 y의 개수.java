class Solution {
    boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (c == 'p') {
                cnt++;
            }
            if (c == 'y') {
                cnt--;
            }
        }
        return cnt == 0 ? true : false;
    }
}